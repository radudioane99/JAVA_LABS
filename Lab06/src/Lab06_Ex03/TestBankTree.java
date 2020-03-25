package Lab06_Ex03;

import Lab06_ex01.BankAccount;


import java.util.Collections;
import java.util.TreeSet;
import java.util.ArrayList;

public class TestBankTree {
    public static void main(String[] args) {
        //Given the fact that a treeSet is automatically sorting elements according to a rule(which CAN NOT be changed),
        //we need 2 of them in order to display the accounts ordered by Owner and by balance (2 different criteria with the methods of comparison included in the classes:SortedTreeAccount,SortedTreeOwner
        TreeSet<BankAccount> tb = new TreeSet<BankAccount>(new SortedTreeAccount());
        TreeSet<BankAccount> to = new TreeSet<BankAccount>(new SortedTreeOwner());
        BankAccount ba1 = new BankAccount("Dan", 2343);
        BankAccount ba2 = new BankAccount("Petcu", 23221);
        BankAccount ba3 = new BankAccount("Cezar", 23);
        BankAccount ba4 = new BankAccount("Sateul", 500);
        BankAccount ba5 = new BankAccount("Paul", 29111);
        BankAccount ba6 = new BankAccount("Oana", 2921);
        tb.add(ba1);
        tb.add(ba2);
        tb.add(ba3);
        tb.add(ba4);
        tb.add(ba5);
        tb.add(ba6);

        to.add(ba1);
        to.add(ba2);
        to.add(ba3);
        to.add(ba4);
        to.add(ba5);
        to.add(ba6);

        BankTree vara = new BankTree(tb,to);
        vara.printAccountsByBalance();
        vara.printAccountsByOwners();


        vara.addAccount("Iosif",234);
        System.out.println("Array with Iosif added sorted by Owner's name alphabetically : \r\n");
        vara.printAccountsByOwners();

        System.out.println("\r\nGive Dan Account: ");
        BankAccount cont = vara.getAccount("Dan");
        System.out.println("Dan account is :"+cont.toString());

        System.out.println("\r\nGive all accounts between 100 and 3000:");
        vara.printAccounts(100,3000);


    }
}
