package dioane.radu.lab2.ex07;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int x=rand.nextInt(100);
        System.out.println(x);
        int i=0;
        while(i!=3) {
            System.out.println("Guesss a number from 0 -> 100" + " Chance number "+(i+1)+":");
            int y=in.nextInt();
            if(x==y) {System.out.println("Congratulations! You won!");break;}
            if(x<y) System.out.println("Try a smaller number!");
            if(x>y) System.out.println("Try a bigger number!");
            i++;
            if (i==3) {System.out.println("YOU LOST !!!");System.out.println("The number was :"+x);}
        }
    }
}
