package Lab04_ex02;

public class TestAuthor {
    public static void main(String[] args) {
        ///Three authors + functions + print
        Author Radu = new Author("Radu", "g@mail", 'm');
        Author Dan = new Author("Dan", "y@mail", 'm');
        Author Ana = new Author("Ana", "la@mail", 'f');

        System.out.println("The initial values : \r\n");
        Radu.ToString();
        Dan.ToString();
        Ana.ToString();

        System.out.println("The changed values : \r\n");

        Radu.Set_Email("dioaneradu@gmail.com");
        Dan.Set_Gender('f');
        Ana.Set_Name("Diana");

        Radu.ToString();
        Dan.ToString();
        Ana.ToString();
    }
}
