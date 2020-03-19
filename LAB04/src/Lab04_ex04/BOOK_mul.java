package Lab04_ex04;

import Lab04_ex02.Author;

import javax.swing.plaf.synth.SynthStyle;
import javax.xml.namespace.QName;
import java.util.Scanner;

public class BOOK_mul {
    //Data input channel
    Scanner scan = new Scanner(System.in);
    //Attributes
    private String Name;
    private int Number_of_AUTHORS;
    protected  Author[] aut;
    private double price;
    private int qtyInStock;

    //Constructor
    public BOOK_mul(String Name, int Number_of_Authors, double price, int qtyInStock, Author[] aut) {
        this.Name = Name;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.Number_of_AUTHORS = Number_of_Authors;
        this.aut=aut;
        System.out.println(this.Number_of_AUTHORS);

    }

    //Print

    public void ToString() {
        System.out.println(this.Name + " by " + this.Number_of_AUTHORS + " authors");
    }

    public int getnumberauthors() {
        return this.Number_of_AUTHORS;
    }

    public void PrintAuthors() {
        for (Author i:aut) {
            i.ToString();
            System.out.println("\r\n");
        }
    }

}



