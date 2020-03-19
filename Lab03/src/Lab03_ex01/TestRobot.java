package Lab03_ex01;


import java.util.Scanner;

public class TestRobot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Robot r = new Robot();
        System.out.println("The default position is: ");
        r.Tostring();
        System.out.println("Set the new position: ");
        int k = scan.nextInt();
        r.change(k);
        r.Tostring();
    }
}
