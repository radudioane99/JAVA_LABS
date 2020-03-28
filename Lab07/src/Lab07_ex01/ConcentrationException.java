package Lab07_ex01;

class ConcentrationException extends Exception{
    //Exception for concentration with a constructor and an integer value
    //There is also an integer value in which we store the concentration c(received form the function which starts exception) and a get function to access it
    private int c; // where we store the concentration value (initialized in the constructor)
    public ConcentrationException(int c,String msg) {
        super(msg); //ConcentrationException class constructor inherited from Exception (predefined method to store the message)
        this.c = c;
    }

    int getConc(){
        return c;
    }
}