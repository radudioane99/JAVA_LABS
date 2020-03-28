package Lab07_ex01;

class TemperatureException extends Exception {
    //!!!!!!ConcentrationException class consists the explanations of Exception subclasses
    private int t;

    public TemperatureException(int t, String msg) {
        super(msg);
        this.t = t;
    }

    int getTemp(){
        return t;
    }
}