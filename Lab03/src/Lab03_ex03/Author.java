package Lab03_ex03;

import java.awt.datatransfer.SystemFlavorMap;

public class Author {
    //Attributes
    private String name;
    private String email;
    char gender;

    //Constructors
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            System.out.println("Invalid gender! ");
        }
    }

    //Getters and Setters + additional set and get for names and emails
    public void Set_Name(String name) {
        this.name = name;
    }

    public String Get_Name() {
        return this.name;
    }

    public void Set_Email(String email) {
        this.email = email;
    }

    public String Get_Email() {
        return this.email;
    }

    public void Set_Gender(char gender) {
        if (gender == 'm' || gender == 'f') this.gender = gender;
        else  System.out.println("Invalid gender! ");
    }

    public char Get_Gender() {
        return this.gender;
    }
    //Print
    public void ToString()
    {
        System.out.println(this.Get_Name()+" ("+this.Get_Gender()+")"+" at "+this.Get_Email()+"\r\n");
    }
}


