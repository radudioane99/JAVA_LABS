package Lab06_ex01;

import java.util.ArrayList;
import java.util.Iterator;

public class TestBackAccount {
    public static void main(String[] args) {
        // Testing ArrayList,Iterators and equals + hashCode
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        BankAccount ba1 = new BankAccount("Dan", 230);
        BankAccount ba2 = new BankAccount("Paul", 23411);
        BankAccount ba3 = new BankAccount("Dan", 230);
        BankAccount ba4 = new BankAccount("Paul", 2302);
        BankAccount ba5 = new BankAccount("Paul", 23411);
        accounts.add(ba1);
        accounts.add(ba2);
        accounts.add(ba3);
        accounts.add(ba4);
        accounts.add(ba5);
        ba5.deposit(500);
        ba2.withdraw(411);
        System.out.println(ba5.toString());
        System.out.println(ba2.toString());
        int contor = 0;
        Iterator it = accounts.iterator();
        while (it.hasNext()) {
            contor++;
            it.next();
        }
        System.out.println("\r\n");
        System.out.println("There are " + contor + " elements in the array \r\n");
        System.out.println("ba1 == ba2 ? : " + ba1.equals(ba2));
        System.out.println("ba1 hashcode : " + ba1.hashCode() + " ba2 hashcode : " + ba2.hashCode() + "\r\n");
        System.out.println("ba1 == ba3 ? : " + ba1.equals(ba3));
        System.out.println("ba1 hashcode : " + ba1.hashCode() + " ba3 hashcode : " + ba3.hashCode() + "\r\n");
    }
}
