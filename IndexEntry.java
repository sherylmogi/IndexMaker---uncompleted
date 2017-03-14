import java.util.ArrayList;
public class IndexEntry
{
    private String word;
    private String given;
    private ArrayList <Integer> numsList;
    void add (int num) {
            if ( numsList.contains (num)) {
        numsList.add (num);
    }
    }

    String getword () {
        String word = given.toUpperCase();
        return word;
    }
    
  public String toString () {
        String stringList = numsList.toString();
        return stringList;
    }

}

