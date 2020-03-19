package Lab04_ex03;

import Lab04_ex02.Author;

public class TestBook {
    public static void main(String[] args) {
        //AGGREGATION example
        Author aut = new Author("Diana", "d@gmail.com", 'f');
        Book bo = new Book("China", aut, 23.33, 200);
        Book boo = new Book("Romania", aut, 21.0);
        System.out.println("Initial values: \r\n");
        aut.ToString();
        bo.ToString();
        boo.ToString();



    }
}
