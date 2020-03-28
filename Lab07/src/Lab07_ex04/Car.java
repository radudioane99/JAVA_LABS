package Lab07_ex04;

import java.io.Serializable;

public class Car implements Serializable{
    //Attributes
    private String model;
    private double price;
    //Constructor
    public Car(String mod , double pri){this.model=mod;this.price=pri;}
    public Car(){}
    //Getters and setters
    public void setModel(String mod) {this.model=mod;}
    public void setPrice(double pri) {this.price=pri;}
    public String getModel() {return this.model;}
    public double getPrice() {return this.price;}


}
