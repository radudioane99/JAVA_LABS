package LAb05_ex01;

public class Square extends Rectangle {
    //Constructors
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    //Setters and Getters
    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
    }

    public void setLength(double length) {
        super.length = super.width = length;
    }

    public void setWidth(double width) {
        super.width = super.length = width;
    }

    //Print “A Square with side=xxx, which is a subclass of yyy”
    public String ToString() {
        return "A Square with side=" + super.length + ", which is a subclass of " + super.ToString();
    }
    // Other methods
    public double getPerimeter() {
        return this.width * 4;
    }
    public double getArea() {
        return this.width * this.width;
    }

}
