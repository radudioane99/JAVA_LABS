package LAb05_ex01;


public class Rectangle extends Shape {
    //Attributes
    protected double width;
    protected double length;

    //Constructors
    public Rectangle() {
        super();
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double width, double length) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    // Getters and setters

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Other methods

    public double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    public double getArea() {
        return this.width * this.length;
    }

    // ToString “A Rectangle with width=xxx and length=zzz, which is a subclass of yyy”
    public String ToString(){
        return "A Rectangle with width "+this.width+" and length "+this.length+" which is a subclass of "+super.ToString();
    }

}
