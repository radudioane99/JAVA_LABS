package Lab07_ex03;

import java.io.*;
import java.util.Scanner;
import java.util.zip.*;

public class MainCompressed {

    // We will have 2 main methods : for compressing and decompressing a file
    static void encryptFile(String name) {

        try {

            //Creating the input buffer
            BufferedReader input = new BufferedReader(new FileReader(name));

            //Creating the new name of the output file
            String newname = "";
            int i = 0;
            while (name.charAt(i) != '.') {
                newname = newname + name.charAt(i);
                i++;
            }
            newname = newname + ".enc";

            //Creating a new file
            File file = new File("/Users/radu/IdeaProjects/work/Lab07/src/Lab07_ex03/" + newname);

            //Writing characters in another file one by one (with encryption decryption code)
            BufferedWriter output = new BufferedWriter(new FileWriter(newname));
            int character;
            while ((character = input.read()) != -1) {
                character = character << 1;
                output.write(character);
            }
            //Close files
            input.close();
            output.close();


        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }

    static void decryptFile(String name) {

        try {

            //Creating the input buffer
            BufferedReader input = new BufferedReader(new FileReader(name));

            //Creating the new name of the output file
            String newname = "";
            int i = 0;
            while (name.charAt(i) != '.') {
                newname = newname + name.charAt(i);
                i++;
            }
            newname = newname + ".dec";

            //Creating a new file
            File file = new File("/Users/radu/IdeaProjects/work/Lab07/src/Lab07_ex03/" + newname);

            //Writing characters in another file one by one (with encryption decryption code)
            BufferedWriter output = new BufferedWriter(new FileWriter(newname));
            int character;
            while ((character = input.read()) != -1) {
                character = character >> 1;
                output.write((char) character);
            }
            //Close files
            input.close();
            output.close();


        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("\r\nWelcome to Radu's Encrypting Program");
        int opt = 1;
        while (opt != 0) {
            System.out.println("1.Encrypt file");
            System.out.println("2.Decrypt File");
            System.out.println("0.Close");
            System.out.println("Give command:");
            opt = in.nextInt();
            switch (opt) {
                case 1: {
                    System.out.print("\r\nGive the file to encrypt:");
                    String fis = in.next();
                    encryptFile("src/Lab07_ex03/" + fis);
                    break;
                }
                case 2: {
                    System.out.print("\r\nGive the file to decrypt:");
                    String fis = in.next();
                    decryptFile("src/Lab07_ex03/" + fis);
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Invalid command!");
                }
            }

        }

    }

}