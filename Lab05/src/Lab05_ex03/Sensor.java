package Lab05_ex03;

public abstract class Sensor {
    //Attributes
    private String location;

    //Constructor
    public Sensor(String location) {
        this.location = location;
    }

    //Methods
    public abstract int readValue();

    public String getLocation() {
        return this.location;
    }


}
