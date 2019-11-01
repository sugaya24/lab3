public class King extends Piece {
    public King(int importanceScore, boolean isWhite) {
        super(importanceScore, isWhite);
    }

    @Override
    public void move() {
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King{value='" + getImportanceScore() + "\'" + "}";
    }

}
