package Lab05_ex02;

public class ProxyImage implements Image {
    //Attributes
    private RealImage realImage; //Incapsulated Realimage object(aggregation)
    private String fileName;
    //Constructor
    public ProxyImage(String fileName,char p){
        this.fileName = fileName;
        if (p=='R') {this.RotatedImage();}
        if (p=='P') {this.display();}
        if (p!='R' && p!='P') {System.out.println("Wrong Parameter!");}
    }
    //Print and check if realimage is not null
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
    //Rotated Image

    @Override
    public void RotatedImage() {
        if (realImage == null){
            realImage=new RealImage(fileName);
        }
        realImage.RotatedImage();
    }
}
