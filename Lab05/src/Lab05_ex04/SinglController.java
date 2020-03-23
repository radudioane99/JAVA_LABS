package Lab05_ex04;

import Lab05_ex03.LightSensor;
import Lab05_ex03.TemperatureSensor;

public class SinglController {
    //Attributes
    private TemperatureSensor tmps;
    private LightSensor ls;
    //The only object of this class controlled by  getController() method
    private static SinglController scl;
    //Constructor private so you can create new objects only in the class corresponding with the element you build.
    private SinglController(TemperatureSensor tmpsen, LightSensor lsen) {
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
    //Function static to access the private variable (the only one allowed of this class) and build it using private constructor
    public static SinglController getController(){
        if (scl==null) {
            TemperatureSensor tmpsen = new TemperatureSensor("Kitchen");
            LightSensor lsen = new LightSensor ("Kitchen");
            scl=new SinglController(tmpsen,lsen);
        }
        return scl;
    }


}
