public class Bishop extends Piece {
    public Bishop(int importanceScore, boolean isWhite) {
        super(importanceScore, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString() {
        return "Bishop{value='" + getImportanceScore() + "\'" + "}";
    }
}
