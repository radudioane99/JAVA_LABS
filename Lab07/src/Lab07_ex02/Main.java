package Lab07_ex02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        // As we don't know if the file exist or not we need to throw a I/O exception
        try {
            //Open file
            //FileReader- used for text files for others :FileInputStream
            BufferedReader stdin = new BufferedReader( new FileReader("src/Lab07_ex02/data.txt"));
            //We need int because they are read as integers and after that transformed in characters
            int number = 0; //number of chars we look for
            int character ; // used to go through the file
            System.out.println("Give character to look for :");
            int c=in.next().charAt(0);
            //while we can read chars
            while ((character = stdin.read()) != -1) {
                System.out.print((char) character);
                if (character==c) number++;
            }
            System.out.println("\r\nThere are "+number+" "+(char)c);
            stdin.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("I/O error: " + e.getMessage());
        }



    }
}
