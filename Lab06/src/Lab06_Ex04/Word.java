package Lab06_Ex04;

import Lab06_ex01.BankAccount;

import java.util.Objects;

public class Word {
    //Stores the word as an object
    //Attributes
    private String name;

    //Constructors
    public Word(String na) {
        this.name = na;
    }

    //Print
    public String toString() {
        return this.name;
    }

    //Equals
    public boolean equals(Word o) {
        if (o instanceof Word && o != null) {
            return this.name == o.name;
        } else {
            System.out.println("The bank account is not valid!");
            return false;
        }
    }


}
