package Lab06_Ex04;

public class ConsoleTest {
    public static void main(String[] args) {
        //Creating a store (HashMap) and a dictionary
        Store st = new Store(new Word(" Clasa"), new Definition(" Colectie de obiecte "));
        Dictionary dict = new Dictionary(st);

        //Add new elements
        dict.addWord(new Word(" Obiect"), new Definition(" Instanta a unei clase "));
        dict.addWord(new Word(" OOP"), new Definition(" Un concept in programrare"));
        dict.addWord(new Word(" Constructor"), new Definition("Functie publica pentru a creea un obiect/instanta"));
        dict.addWord(new Word(" C++"), new Definition(" Limbaj de programare"));

        //Print all Words
        System.out.println("The words are:");
        dict.getAllWords();
        System.out.println("\r\n");

        System.out.println("The definitions are:");
        dict.getAllDefinitions();
        System.out.println("\r\n");

        Word wo = new Word("SQL");
        dict.addWord(wo, new Definition("Limbaj Pentru baze de date"));

        // getDefinition -> Definition
        System.out.println("The SQL description :" + dict.getDefinition(wo).toString());
    }
}
