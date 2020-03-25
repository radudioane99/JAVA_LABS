package Lab06_Ex04;

import java.util.Scanner;

public class FinalTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Instantiate the objects we need
        Store st = new Store();
        Dictionary dict = new Dictionary(st);
        // Menu:
        System.out.println("\r\n Welcome to Java Dictionary : \r\n");
        int opt = 1;
        while (opt != 0) {
            System.out.println("1. Add new word ");
            System.out.println("2. Print all words");
            System.out.println("3. Print all Definitions");
            System.out.println("4. Words + definitions");
            System.out.println("0. Exit");
            System.out.println(" Choose an option : ");
            opt = scan.nextInt();
            switch (opt) {
                case 1: {
                    System.out.println("Word:");
                    //Empty buffer
                    scan.nextLine();
                    String w = scan.nextLine();
                    System.out.println("Definition:");
                    String d = scan.nextLine();
                    dict.addWord(new Word(w), new Definition(d));
                    break;

                }
                case 2: {
                    System.out.println("The words are:");
                    dict.getAllWords();
                    break;
                }
                case 3: {
                    System.out.println("The definitions are:");
                    dict.getAllDefinitions();
                    break;
                }
                case 4 :{
                    System.out.println("The words + definitions :");
                    dict.getAll();
                }
                case 0: {
                    break;
                }
                default:{System.out.println("Invalid Command!");break;}

            }
        }
    }
}
