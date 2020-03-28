package Lab07_ex01;

class Cofee{
    //Attributes
    private int temp;
    private int conc;
    static int nrcofees;
    //Constructor +print+gets
    Cofee(int t,int c){temp = t;conc = c;}
    int getTemp(){return temp;}
    int getConc(){return conc;}
    public String toString(){return "[cofee temperature="+temp+":concentration="+conc+"]";}
}