package Lab06_ex02;

import Lab06_ex01.BankAccount;

import java.util.Comparator;

class SortByAccount implements Comparator<BankAccount> {
    //Special class witch implements Comparator interface and where you can modify the criteria of how 2 objects are compared by Collections.sort()
    //This new Object will be included in Collection.sort() command!
    //In order to Sort an Array descending just switch b <-> a
    public int compare(BankAccount a, BankAccount b) {
        return (int) (a.getBalance() - b.getBalance());
    }

}