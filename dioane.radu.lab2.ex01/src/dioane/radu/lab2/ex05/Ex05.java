package dioane.radu.lab2.ex05;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("n= ");
        int n = in.nextInt();
        int i;
        Random rand = new Random();
        int v[] = new int[n];
        for (i=0;i<n;i++) {
            v[i] = rand.nextInt(100);
        }
        boolean ok =false;
        int aux;
        while (ok==false)
        {
            ok=true;
            for (i=0;i<n-1;i++)
                if (v[i]>v[i+1]) {aux=v[i];v[i]=v[i+1];v[i+1]=aux;ok=false;}
        }
        for (i=0;i<n;i++)
            System.out.println(v[i]+" ");
    }
}
