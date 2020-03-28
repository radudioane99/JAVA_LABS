package Lab07_ex01;

public class NumberException extends Exception {
    //!!!!!!ConcentrationException class consists the explanations of Exception subclasses
    // Attributes
    private int number;
    // Constructor
    public NumberException(String message,int nmb) {super(message);this.number=nmb;}
    // Getter
    public int getNumber(){return number;}
}
