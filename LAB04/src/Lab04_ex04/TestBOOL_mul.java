package Lab04_ex04;

import Lab04_ex02.Author;

import java.util.Scanner;

public class TestBOOL_mul {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i, Number_of_AUTHORS;
        System.out.println("Get number of authors: ");
        Number_of_AUTHORS = scan.nextInt();
        Author[] aut = new Author[Number_of_AUTHORS];
        for (i = 0; i < Number_of_AUTHORS; i++) {
            System.out.println("Name : ");
            String name = scan.next();
            System.out.println("Email : ");
            String email = scan.next();
            System.out.println("Gender : ");
            char gender = scan.next().charAt(0);
            aut[i] = new Author(name, email, gender);

        }
        BOOK_mul carte=new BOOK_mul("Ion",Number_of_AUTHORS,21.32,100,aut);
        carte.ToString();
        carte.PrintAuthors();


    }
}
