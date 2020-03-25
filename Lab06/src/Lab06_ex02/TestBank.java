package Lab06_ex02;

import Lab06_ex01.BankAccount;

import java.util.ArrayList;

public class TestBank {
    public static void main(String[] args) {
        ArrayList<BankAccount> baarray = new ArrayList<BankAccount>();
        BankAccount ba1 = new BankAccount("Dan", 2343);
        BankAccount ba2 = new BankAccount("Petcu", 23221);
        BankAccount ba3 = new BankAccount("Dan", 23);
        BankAccount ba4 = new BankAccount("Sateul", 500);
        BankAccount ba5 = new BankAccount("Paul", 29111);
        BankAccount ba6 = new BankAccount("Oana", 2921);
        baarray.add(ba1);
        baarray.add(ba2);
        baarray.add(ba3);
        baarray.add(ba4);
        baarray.add(ba5);
        baarray.add(ba6);
        Bank var = new Bank(baarray);
        System.out.println("Sorted array: \r\n");
        var.printAccounts();

        var.addAccount("Iosif",234);
        System.out.println("Array with Iosif added : \r\n");
        var.printAccounts();

        System.out.println("\r\nGive Dan Account: ");
        BankAccount cont = var.getAccount("Dan");
        System.out.println("Dan account is :"+cont.toString());

        System.out.println("\r\nGive all accounts between 100 and 3000:");
        var.printAccounts(100,3000);

        System.out.println("\r\nGive all accounts alphabetically:");
        var.getALllAccounts();



    }
}
