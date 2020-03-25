package Lab06_ex02;

import Lab06_ex01.BankAccount;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Bank {
    //Attributes
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    //Constructor
    public Bank(ArrayList<BankAccount> acc) {
        this.accounts = acc;
    }

    // Methods
    public void addAccount(String Owner, double Balance) {
        BankAccount anew = new BankAccount(Owner, Balance);
        accounts.add(anew);
    }

    public void printAccounts() {
        System.out.println("Unsorted: ");
        //How you move through an array
        for (BankAccount ba : accounts)
            System.out.println(ba.toString());
        ///Sorting the array + print
        System.out.println("\r\n Sorted: ");
        Collections.sort(accounts, new SortByAccount());
        for (BankAccount ba : accounts)
            System.out.println(ba.toString());

    }

    //Overloaded method printAll
    public void printAccounts(double minBalance, double maxBalance) {
        for (BankAccount ba : accounts) {
            if (ba.getBalance() > minBalance && ba.getBalance() < maxBalance) System.out.println(ba.toString());
        }
    }

    //Get a bank account method
    public BankAccount getAccount(String own) {
        for (BankAccount ba : accounts) {
            if (ba.getOwner() == own) return ba;
        }
        return new BankAccount("NU EXISTA CONT",0);
    }
    //All accounts ordered alphabetically
    public void getALllAccounts(){
        System.out.println("\r\n Sorted Alphabetically: ");
        Collections.sort(accounts, new SortByOwner());
        for (BankAccount ba : accounts)
            System.out.println(ba.toString());
    }
}
