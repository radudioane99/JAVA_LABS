package dioane.radu.lab2.ex01;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("x= ");
        int x =in.nextInt();
        System.out.println("y= ");
        int y =in.nextInt();
        if (x>=y)
            System.out.println(x);
        else System.out.println(y);
    }
}
