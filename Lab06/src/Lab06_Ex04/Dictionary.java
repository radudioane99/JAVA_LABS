package Lab06_Ex04;

public class Dictionary {
    //Attributes
    //Store contains a collection of data (a HashMap) which is included in the dictionary where the methods are(executable part)
    private static Store dictionary;

    //Constructor
    public Dictionary(Store st) {
        this.dictionary = st;
    }

    //Methods
    public void addWord(Word wd, Definition def) {
        dictionary.dict.put(wd, def);
    }
    //The get definition which return a definition object
    public Definition getDefinition(Word wd) {
        for (Word j : dictionary.dict.keySet()) {
            if (j.equals(wd)){
                return dictionary.dict.get(j);
            }
        }
      return null;
    }

    //Returns all words(keys)
    public void getAllWords() {
        for (Word i : dictionary.dict.keySet()) {
            System.out.println(i.toString() + "\r\n");

        }
    }

    //Returns all information word +def
    public void getAll() {
        for (Word i : dictionary.dict.keySet()) {
            System.out.println(i.toString() +":  "+dictionary.dict.get(i).toString()+"\r\n");

        }
    }
    //Return all descriptions/definitions (values)
    public void getAllDefinitions() {

        for ( Word j: dictionary.dict.keySet() ) {
            System.out.println( dictionary.dict.get(j).toString() + "\r\n");
        }
    }

}
