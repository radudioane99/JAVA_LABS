package Lab03_ex04;

import java.lang.Math;

public class MyPoint {
    //Attributes
    private int x;
    private int y;

    //Constructors
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters and Setters
    public void setx(int x) {
        this.x = x;
    }

    public int getx() {
        return this.x;
    }

    public void sety(int y) {
        this.y = y;
    }

    public int gety() {
        return this.y;
    }

    public void setxy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Print
    public void ToString() {
        System.out.println("(" + this.getx() + ", " + this.gety() + ")" + "\r\n");
    }

    // Methods

    public double distance(int x, int y) {
        return Math.sqrt((this.getx()- x)*(this.getx()-x)+((this.gety() - y)*(this.gety()-y)));
    }
    // overloading method

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(this.getx() - another.getx(), 2) + Math.pow((this.gety() - another.gety()), 2));
    }
}