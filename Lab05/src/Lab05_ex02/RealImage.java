package Lab05_ex02;

public class RealImage implements Image {
    //Attribute
    private String fileName;
    //Constructor
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    //Print
    public void display() {
        System.out.println("Displaying " + fileName);
    }
    //Loading used in constructor
    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
    //Rotated image
    public void RotatedImage(){
        System.out.println("Display rotated "+this.fileName);
    }
}
