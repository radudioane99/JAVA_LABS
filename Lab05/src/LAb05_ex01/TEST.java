package LAb05_ex01;

import javafx.scene.shape.Circle;

import javax.crypto.Cipher;
import java.awt.desktop.PrintFilesEvent;

public class TEST {
    public static void main(String[] args) {
        //Circle
        circle c1 = new circle(3, "Green", false);
        circle c2 = new circle();
        circle c3 = new circle(12);
        System.out.println(c1.ToString());
        System.out.println(c2.ToString());
        System.out.println(c3.ToString());
        System.out.println("\r\n");
        //Rectangle
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2, 3);
        Rectangle r3 = new Rectangle(4, 8, "Red", false);
        System.out.println(r1.ToString());
        System.out.println(r2.ToString());
        System.out.println(r3.ToString());
        System.out.println("\r\n");
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
        //Final test
        Shape []a = new Shape[5];
        a[0]=new Rectangle(1,2);
        a[1]=new circle(5);
        a[2]=new Rectangle(5,8);
        a[3]=new Rectangle(3,10);
        a[4]=new Square(2,"red",false);

        int i;
        for (i=0;i<5;i++)
        {
            System.out.println("The perimeter is "+a[i].getPerimeter());
            System.out.println("The area is "+a[i].getArea()+"\r\n");
        }
    }
}
