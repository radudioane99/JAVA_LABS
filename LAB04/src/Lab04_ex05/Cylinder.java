package Lab04_ex05;

import Lab04_ex01.Circle;

public class Cylinder extends Circle {
    //Attributes
    private double height;
    //Constructors
    public Cylinder (){
        super();
    }
    public Cylinder (double radius,double height){
        super(radius);
        this.height=height;
    }
    // Area method

    @Override
    public double getArea() {
        return 2*super.getArea()+2*3.14159*this.getRadius()*this.height;
    }
}
