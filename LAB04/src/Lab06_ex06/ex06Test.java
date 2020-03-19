package Lab06_ex06;

public class ex06Test {
    public static void main(String[] args) {
        //Shape
        Shape s = new Shape("Blue", true);
        System.out.println(s.ToString());
        //Circle
        circle c1 = new circle(3, "Green", false);
        circle c2 = new circle();
        circle c3 = new circle(12);
        System.out.println(c1.ToString());
        System.out.println(c2.ToString());
        System.out.println(c3.ToString());
        //Rectangle
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 3);
        Rectangle r3 = new Rectangle(4, 8, "Red", false);
        System.out.println(r1.ToString());
        System.out.println(r2.ToString());
        System.out.println(r3.ToString());
        System.out.println("\r\n");
        System.out.println(r3.getArea());
        System.out.println(r3.getPerimeter());
        //Square
        Square sq1 = new Square();
        Square sq2 = new Square(2);
        Square sq3 = new Square(5, "Black", false);
        System.out.println(sq1.ToString());
        System.out.println(sq2.ToString());
        System.out.println(sq3.ToString());
        sq2.setLength(4);
        System.out.println(sq2.getLength());
        System.out.println(sq2.getWidth());
        sq2.setLength(4);
        System.out.println(sq2.getWidth());
        System.out.println(sq2.getLength());

    }
}
