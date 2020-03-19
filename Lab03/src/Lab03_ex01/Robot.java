package Lab03_ex01;

public class Robot {
    // Attributes
    private int x;

    //Constructors
    public Robot() {
        this.x = 1;
    }

    ///Methods
    public void change(int k) {
        if (k >= 1) this.x = k;
        else System.out.println("The value should be greater or equal with one!");
    }

    public void Tostring() {
        System.out.println("The robot position is " + this.x);
    }
    // Get
    public int getx()
    {
        return this.x;
    }

}
