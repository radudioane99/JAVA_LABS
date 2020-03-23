package Lab05_ex02;

public class testex02 {
    public static void main(String[] args){
        //Real Image tests
        RealImage ri = new RealImage("realimg");
        ri.display();
        ri.RotatedImage();
        System.out.println("\r\n");
        //Proxy Image tests
        //R=rotated image;P= display image
        ProxyImage ip=new ProxyImage("proxyimg",'R');
        System.out.println("\r\n");

        ProxyImage ipp=new ProxyImage("proxy",'P');
        System.out.println("\r\n");

        ProxyImage ippp=new ProxyImage("pro",'A');
        System.out.println("\r\n");

        System.out.println("\r\n");
        //Directly call the methods
        ip.display();
        ip.RotatedImage();
    }
}
