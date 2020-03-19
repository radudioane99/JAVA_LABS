package Lab04_ex05;
import Lab04_ex01.Circle;
public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        Cylinder c2=new Cylinder(3,5);
        System.out.println("The area after overriding:");
        System.out.println(c2.getArea()); //Area of circle before overriding
    }
}
