package Lab07_ex01;

    public class CofeeTest {
        public static void main(String[] args) {
            //Main method
            CofeeMaker mk = new CofeeMaker();
            CofeeDrinker d = new CofeeDrinker();
            Cofee.nrcofees = 0;
            //Creating 15 coffees with random values and catch possible exceptions caused by temperature and concentration,or number
            for (int i = 0; i < 15; i++) {
                Cofee c = mk.makeCofee();
                try {
                    d.drinkCofee(c);
                }
               // catch (TemperatureException e) {
                 //   System.out.println("Exception:" + e.getMessage() + " temp=" + e.getTemp());
               // }
                //catch (ConcentrationException e) {
                  //  System.out.println("Exception:" + e.getMessage() + " conc=" + e.getConc());
                //}
                catch (NumberException e) {
                    System.out.println("Exception:"+e.getMessage()+ " Number= "+e.getNumber());
                }
                finally {
                    //This is executed no matter if we have an exception or not!
                    System.out.println("Throw the cofee cup.\n");
                }
            }
        }
    }













