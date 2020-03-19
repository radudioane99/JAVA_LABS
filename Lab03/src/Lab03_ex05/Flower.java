package Lab03_ex05;

import java.util.concurrent.Flow;

public class Flower {

        private int petal;
        private static int number;
        Flower(int p){
            petal=p;
            System.out.println("New flower has been created!");
            number++;
        }
        public static int HowMany()
        {
          return number;
        }

        public static void main(String[] args) {
            Flower f1 = new Flower(4);
            Flower f2 = new Flower(6);
            Flower f3 = new Flower(9);
            Flower f4 = new Flower(2);
            System.out.println("There are "+ Flower.HowMany()+" objects instantiated");
        }

}
