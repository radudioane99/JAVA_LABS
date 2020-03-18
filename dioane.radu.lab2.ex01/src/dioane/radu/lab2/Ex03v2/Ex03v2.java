package dioane.radu.lab2.Ex03v2;

import java.util.Scanner;

public class Ex03v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a= ");
        int a = in.nextInt();
        System.out.println("b= ");
        int b = in.nextInt();
        int i = a;
        Prime obj = new Prime();
        while (i != b)
        {if (obj.prime_checker(i) == true) System.out.println(i + " ");i++;}

    }



}

class Prime {
    public boolean prime_checker(int i) {
        if (i < 2) return false;
        int d = 2;
        for (d = 2; d <= Math.sqrt(i); d++) {
            if (i % d == 0) return false;
        }
        return true;
    }


}
