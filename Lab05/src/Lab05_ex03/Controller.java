package Lab05_ex03;

import javafx.scene.effect.Light;

public class Controller {
    //Attributes
    private TemperatureSensor tmps;
    private LightSensor ls;

    //Constructor
    public Controller(TemperatureSensor tmpsen, LightSensor lsen) {
        tmps = tmpsen;
        ls = lsen;
    }
    //Control function defined in the exercise
    public void control() {
        int i = 1;
        while (i <= 20) {
            //Temperature generate +obtaining result
            tmps.getValue();
            System.out.println("Temperature location " + tmps.getLocation() + " second " + i + ":" + tmps.readValue());
            //Temperature generate +obtaining result
            ls.getValue();
            System.out.println("Light location " + ls.getLocation() + " second " + i + ":" + ls.readValue());
            System.out.println("\r\n");
            i++;
        }
    }
}
