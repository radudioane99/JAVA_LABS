package Lab05_ex03;

import java.util.Random;

public class TemperatureSensor extends Sensor {
    //Attributes
    private int value;
    //Constructor
    public TemperatureSensor(String Location) {
        super(Location);
    }

    //GetValue
    public void getValue() {
        Random rand = new Random();
        this.value = rand.nextInt(100);
    }

    //ReadValue inherited
    public int readValue() {
        return this.value;
    }

}
