package LAb05_ex01;

public abstract class Shape {
    //Attributes
    protected String color ;
    protected boolean filled;
    //Constructors
    public Shape(){color="green";filled=true;}
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    //Getters and Setters
    public String getColor(){return this.color;}
    public void setColor (String color){this.color=color;}
    public boolean isFilled(){return this.filled;}
    public void setFilled(boolean filled) {this.filled=filled;}
    //Print
    public String ToString(){return "A Shape with color of "+this.color+" and Filled: "+this.filled;}
    //
    abstract double getArea();
    abstract double getPerimeter();
}
