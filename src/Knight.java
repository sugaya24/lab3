public class Knight extends Piece {
    public Knight(int importanceScore, boolean isWhite) {
        super(importanceScore, isWhite);
    }

    @Override
    public void move() {
        System.out.println("Like an L");
    }

    @Override
    public String toString() {
        return "Knight{value='" + getImportanceScore() + "\'" + "}";
    }
}
