package Lab07_ex04;

import java.io.*;
import java.util.Scanner;

public class MainSerializable {
    //The function used for serialize a car
    //We use an ObjectOutputStream a special stream capable of storing objects(compact with class signature, not only random data)
    //It will write byte to byte the whole object so it needs a basic OutputStream as parameter (location)
    //Don't forget the exception created by the File functions
    public static void SaveCar(Car masina) throws IOException {
        try {
            FileOutputStream fout = new FileOutputStream("src/Lab07_ex04/"+masina.getModel()+".ser");
            ObjectOutputStream stdout = new ObjectOutputStream(fout);
            stdout.writeObject(masina);
            System.out.println("Object saved!");
            stdout.close();
            fout.close();
        } catch (IOException e) {
            System.out.println("Object not saved I/O exception!\r\n");
        }
    }
    //The function used for deserialize a car
    //We use an ObjectInputStream a special stream capable of getting objects from a serialized file and get them ready to use in our program
    //It will read byte to byte the whole object so it needs a basic InputStream as parameter (where object is stored)
    //Don't forget the exception created by the File functions


    public static void ReadCar(String obj) {

        Car masina = new Car();
        try {
            FileInputStream in = new FileInputStream("src/Lab07_ex04/" + obj+".ser");
            ObjectInputStream stdin = new ObjectInputStream(in);
            masina = (Car) stdin.readObject();

        } catch (IOException e) {
            System.out.println("Object not found!\r\n");
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("The class of the object not found (in active project)!\r\n");
            return;
        }

        System.out.println("The Car read :");
        System.out.print("Model: " + masina.getModel() + "  Price: " + masina.getPrice());

    }

    public static void ViewCars(){
            File f = new File("src/Lab07_ex04");//the current directory
            //A special interface used in filtering files
            //It has a predefined method (the only one) which return true/false to see which files are you looking for
            //In order to work you need to override it
            FilenameFilter filter = new FilenameFilter() {

                public boolean accept(File FILE,String name) {
                    return name.endsWith("ser");
                }
            };
            //Create an array where we store all the files remained after the filter application
            File[] files = f.listFiles(filter);
            //Print all the files names
            System.out.println("The current serialized objects are:");
            for (File file : files) {
                System.out.println(file.getName());
            }

        }




    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("\r\nWelcome to Radu's Serialization Program");
        int opt = 1;
        while (opt != 0) {
            System.out.println("\r\n\r\n1.Create & Save car");
            System.out.println("2.Read car");
            System.out.println("3.See the cars saved");
            System.out.println("0.Close");
            System.out.println("Give command:");
            opt = in.nextInt();
            switch (opt) {
                case 1:{
                    double pret;String model;
                    System.out.print("Give mode :");model=in.next();
                    System.out.print("Give price :");pret=in.nextDouble();
                    SaveCar(new Car(model,pret));
                    break;
                }
                case 2:{
                    String object;
                    System.out.print("Give the model you want :");object=in.next();
                    ReadCar(object);
                    break;
                }
                case 3:{
                    ViewCars();
                    break;
                }
                case 0 :{break;}
                default:{System.out.print("Invalid Operation!");break;}



            }


        }

    }


}