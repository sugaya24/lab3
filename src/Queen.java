public class Queen extends Piece {
    public Queen(int importanceScore, boolean isWhite) {
        super(importanceScore, isWhite);
    }

    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString() {
        return "Queen{value='" + getImportanceScore() + "\'" + "}";
    }
}
