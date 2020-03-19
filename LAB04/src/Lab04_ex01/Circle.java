package Lab04_ex01;

public class Circle {
    //PI
    static double pi = 3.14159;
    //Attributes
    private double radius;
    private String color;

    //Constructors
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle(String color) {
        this.color = color;
        radius = 1.0;
    }

    //Methods for area and radius
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * pi;
    }

    // Print function
    public void Tostring() {
        System.out.println("The circle has : ");
        System.out.println("The radius : " + this.radius);
        System.out.println("The color: " + this.color);
        System.out.println("\r\n");

    }
}