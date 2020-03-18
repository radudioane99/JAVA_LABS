package dioane.radu.lab2.ex06;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("n= ");
        int n = in.nextInt();
        // Non-recursive method
        int i;
        double fact=1;
        for (i=1;i<=n;i++)
            fact=fact*i;
        System.out.println("n!= "+fact);

        // Recursive method
        double factorial = recurs(n);
        System.out.println("n!= "+factorial);

    }
        public static long recurs(int n) {
            if (n>=1)
                return n*recurs(n-1);
            else return 1;
        }

}
