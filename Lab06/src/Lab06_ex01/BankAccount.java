package Lab06_ex01;

import Lab06_ex02.Bank;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class BankAccount {
    //Attributes
    private String owner;
    private double balance;

    //Constructor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    //Methods
    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    //Methods from object class
    //Equals compares 2 objects according to how you consider them equal and how you override the method
    public boolean equals(BankAccount ba) {
        if (ba instanceof BankAccount && ba != null) {
            return this.balance == ba.balance && this.owner == ba.owner;
        } else {
            System.out.println("The bank account is not valid!");
            return false;
        }
    }

    //Encodes every object (in a unique code ideally) in order to be easier to compare objects and look for objects in arrays
    //If Equals->true they MUST be equal
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + (int) balance;
        return result;
    }


//Print Method toString also inherited from object class

    public String toString() {
        return "The bank account belongs to : " + this.owner + " and it has stored in it : " + this.balance + " $" + "\r\n";
    }

}

