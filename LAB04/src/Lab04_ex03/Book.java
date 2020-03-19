package Lab04_ex03;

public class Book {
    //Attributes
    private String Name;
    private Lab04_ex02.Author aut;
    private double price;
    private int qtyInStock;

    //The constructors
    public Book(String Name, Lab04_ex02.Author aut, double price) {
        this.Name = Name;
        this.aut = aut;
        this.price = price;
        this.qtyInStock = 0;

    }

    public Book(String Name, Lab04_ex02.Author aut, double price, int qtyInStock) {
        this.Name = Name;
        this.aut = aut;
        this.price = price;
        this.qtyInStock = qtyInStock;

    }

    // Getters and Setters
    public String getName() {
        return this.Name;
    }

    public double getPrice() {
        return this.price;
    }

    public Lab04_ex02.Author getAuthor() {
        return this.aut;
    }

    public int getQtyInStock() {
        return this.qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    //'book-name' by author-name (gender) at email”.

    //Print
    public void ToString() {
        System.out.println("'" + this.getName() + "' by ");
        aut.ToString();
        System.out.println("\r\n");

    }
}
