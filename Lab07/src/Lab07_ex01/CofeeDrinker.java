package Lab07_ex01;

class CofeeDrinker{
    //Method which throws the exceptions if one of the following if's is true
    //Cofee method which generates exception
    void drinkCofee(Cofee c) throws NumberException{
        //if(c.getTemp()>60)
          //  throw new TemperatureException(c.getTemp(),"Cofee is to hot!");
        //if(c.getConc()>50)
           // throw new ConcentrationException(c.getConc(),"Cofee concentration to high!");
        if(Cofee.nrcofees>8)
            throw new NumberException("Too many cofees!!!!",Cofee.nrcofees);
        System.out.println("Drink cofee:"+c);
    }
}