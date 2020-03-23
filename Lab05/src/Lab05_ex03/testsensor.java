package Lab05_ex03;

public class testsensor {
    public static void main(String[] args) {

        LightSensor ls = new LightSensor("Kitchen");
        TemperatureSensor ts = new TemperatureSensor("Living Room");
        Controller cnt = new Controller(ts, ls);
        cnt.control();


    }
}
