package dioane.radu.lab2.ex04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("n= ");
        int n = in.nextInt();
        int i;
        int v[] = new int[n];
        System.out.println("The elements :");
        for (i=0;i<n;i++) {
            v[i] = in.nextInt();
        }
        int maxim=v[1];
        for(i=0;i<n;i++) {
            if (v[i] > maxim) maxim = v[i];
        }
        System.out.println("The maxim is "+maxim);



    }

}
