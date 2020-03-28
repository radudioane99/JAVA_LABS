package Lab07_ex01;

public class CofeeMaker {
    //Constructor
    public CofeeMaker(){}
    //makeCofee randomly generates a new cofee with random temperature and concentration
    //Basically the constructor of Cofee class
    Cofee makeCofee(){
        System.out.println("Make a coffe");
        int t = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        Cofee.nrcofees++;
        Cofee cofee = new Cofee(t,c);
        return cofee;
    }

}