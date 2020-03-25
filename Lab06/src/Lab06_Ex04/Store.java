package Lab06_Ex04;

import java.util.HashMap;

public class Store {
    //Attributes
    public static HashMap<Word, Definition> dict = new HashMap<Word, Definition>();

    // Constructor, it is instantiated only when you add the first element can be also just public Store(){};
    public Store(Word wd, Definition def) {
        dict.put(wd, def);
    }
    public Store(){}
}
