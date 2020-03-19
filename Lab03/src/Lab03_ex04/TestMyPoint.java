package Lab03_ex04;


import java.util.Scanner;

public class TestMyPoint {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("The initivial values :");
        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint (2,3);
        //Initial values
        a.ToString();
        b.ToString();
        //After set vales
        System.out.println("The seted values :");
        a.setxy(14,2);
        b.setx(3);
        b.sety(12);
        a.ToString();
        b.ToString();
        //Distance in 2 modes
        System.out.println("The distance between b and the point (3,3) :"+b.distance(14,2));
        System.out.println("The distance between b and the point a :"+b.distance(a));
    }
}

