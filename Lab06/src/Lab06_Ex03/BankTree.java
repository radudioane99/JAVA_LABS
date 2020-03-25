package Lab06_Ex03;

import Lab06_ex01.BankAccount;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
public class BankTree {
    //Attributes
    //Two treeSets one automatically sorted by balance and the other one by owner
    private   TreeSet<BankAccount> tbalance = new TreeSet<BankAccount>();
    private   TreeSet<BankAccount> towner = new TreeSet<BankAccount>();

    //Constructor(create both trees)
    public BankTree(TreeSet<BankAccount> acc,TreeSet<BankAccount> own) {
        this.tbalance = acc;
        this.towner = own;
    }
    // Methods (add in both trees)
    public void addAccount(String Owner, double Balance) {
        BankAccount anew = new BankAccount(Owner, Balance);
        tbalance.add(anew);
        towner.add(anew);
    }
    ///Print the treeSet sorted by owner
    public void printAccountsByOwners() {
        ///Sorting the array by balance + print
        System.out.println("\r\nSorted Alphabetically: ");
        for (BankAccount ba : towner)
            System.out.println(ba.toString());
        System.out.println("\r\n");

    }

    //print accounts with balances between limits
    public void printAccounts(double minBalance, double maxBalance) {
        for (BankAccount ba : tbalance) {
            if (ba.getBalance() > minBalance && ba.getBalance() < maxBalance) System.out.println(ba.toString());
        }
    }

    //Get a bank account method
    public BankAccount getAccount(String own) {
        for (BankAccount ba : tbalance) {
            if (ba.getOwner() == own) return ba;
        }
        return new BankAccount("NU EXISTA CONT",0);
    }
    /////Print the treeSet sorted by balance
    public void printAccountsByBalance(){
        System.out.println("\r\n Sorted by balance: ");
        for (BankAccount ba : tbalance)
            System.out.println(ba.toString());
        System.out.println("\r\n");
    }

}
