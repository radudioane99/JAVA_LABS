package Lab05_ex03;

import javafx.scene.effect.Light;

import java.util.Random;

public class LightSensor extends Sensor {
    //Attributes
    private int value;


    //Constructor
    public LightSensor(String Location) {
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
