public class Rook extends Piece {
    public Rook(int importanceScore, boolean isWhite) {
        super(importanceScore, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString() {
        return "Rook{value='" + getImportanceScore() + "\'" + "}";
    }
}
