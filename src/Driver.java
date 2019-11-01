import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Pawn pawn = new Pawn(1, true);
        Knight knight = new Knight(2, true);
        Bishop bishop = new Bishop(3, true);
        Rook rook = new Rook(5, true);
        Queen queen = new Queen(9, true);
        King king = new King(10000, true);

        ArrayList<Piece> pieces = new ArrayList<>();
        pieces.add(pawn);
        pieces.add(knight);
        pieces.add(bishop);
        pieces.add(rook);
        pieces.add(queen);
        pieces.add(king);

        for (Piece piece : pieces) {
            System.out.print(piece.toString() + " => ");
            piece.move();
        }


        Pawn p1 = new Pawn(1, true, true, queen);
        Pawn p2 = new Pawn(1, true, false, null);
        Pawn p3 = new Pawn(1, false, false, null);
        Pawn p4 = new Pawn(1, false, true, queen);
        Pawn p5 = new Pawn(1, true, true, knight);
        
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
       

//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p1.equals(p2)); // p1 != p2
//        System.out.println(p1.equals(p1)); // p1 == p1

        // .equals() method is from Object class

        // Strings are immutable ("Hello")
        // String s = "Hello"; // String literal "A"
        // String k = "Hello"; // "String-pool"
        // String t = "Hello"; // "String-pool"
//        String t = new String("Hello"); // heap
        // System.out.println(Integer.toHexString(s.hashCode()));
        // System.out.println(Integer.toHexString(k.hashCode()));
        // s += "a";    // "Helloa"
        // System.out.println(Integer.toHexString(s.hashCode()));


        // compile
        // run
        // System.out.println(s == t);
        // System.out.println(s.equals(t));


    }
}
