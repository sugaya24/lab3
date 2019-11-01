public class Pawn extends Piece {
    private static final int SCORE = 1;
    private boolean promoted;
    private Piece newPiece;

    public Pawn(int importanceScore, boolean isWhite) {
        super(importanceScore, isWhite);
    }

    public Pawn(int importanceScore, boolean isWhite, boolean promoted, Piece newPiece) {
        super(importanceScore, isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    public void promote(Piece newPiece) {
        if (!promoted) {
            this.promoted = true;
            this.newPiece = newPiece;
        }
    }

    public boolean isPromoted() {
        return promoted;
    }

    public Piece getNewPiece() {
        return newPiece;
    }

    @Override
    public void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return "Pawn{value='" + getImportanceScore() + "\'" + "}";
    }

    @Override
    public boolean equals(Object obj) {
        Pawn pawn = (Pawn) obj;
        if (!super.equals(pawn)) {
            // importanceScore and isWhite
            return false;
        }
        if (isPromoted() != pawn.isPromoted()) {
            // promoted or not
            return false;
        }
        if (isPromoted() && pawn.isPromoted()) {
            // if you don't check if they are promoted or not, it might give you null pointer exception
            // because, you can not call getNewPiece() if the piece is not promoted.

            // both are promoted
            return getNewPiece().equals(pawn.getNewPiece());
        }
        // both are not promoted
        return true;
    }
}
