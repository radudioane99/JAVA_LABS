package Lab03_ex02;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /// Construct 3 circles using 3 constructors + prints
        Circle c1 = new Circle();
        Circle c2 = new Circle("green");
        Circle c3 = new Circle(5.5);

        c1.Tostring();
        c2.Tostring();
        c3.Tostring();

        System.out.println("The radius of c3 is :" + c3.getRadius());
        System.out.println("The area of c3 is :" + c3.getArea());

    }
}
