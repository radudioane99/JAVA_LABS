package Lab05_ex04;

public class TestSinglController {
    public static void main(String[] args) {
        //test Singleton Controller
        SinglController scl = SinglController.getController();
        scl.control();

    }
}
