package Lab06_ex06;

import javax.print.DocFlavor;

public class circle extends Shape {
    final double pi = 3.14159;
    //Attributes
    private double radius;

    //Constructors
    public circle() {
        super();
        radius = 1.0;
    }

    public circle(double radius) {
        super();
        this.radius = radius;
    }

    public circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //Getters,Setters and other methods
    public double getRadius() {
        return this.radius;
    }

    public double getPerimeter() {
        return this.radius * 2 * pi;
    }

    public double getArea() {
        return this.radius * this.radius * pi;
    }

    public void SetRadius(double radius) {
        this.radius = radius;
    }

    //Print
    public String ToString() {
        return "A circle with radius= " + this.radius + " which is a subclass of " + super.ToString();
    }
}
