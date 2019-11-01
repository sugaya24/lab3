public abstract class Piece {
    // instance fields
    private int importanceScore;
    private boolean isWhite;

    // constructor
    public Piece(int importanceScore, boolean isWhite) {
        this.importanceScore = importanceScore;
        this.isWhite = isWhite;
    }

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    /**
     * @return the importanceScore
     */
    public int getImportanceScore() {
        return importanceScore;
    }

    public abstract void move();

    @Override
    public boolean equals(Object obj) {
        Piece piece = (Piece) obj;
        if (importanceScore == piece.importanceScore && isWhite == piece.isWhite) {
            return true;
        }
        return false;
    }
}
