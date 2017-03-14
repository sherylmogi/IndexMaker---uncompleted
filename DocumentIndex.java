import java.util.*;
public class DocumentIndex extends ArrayList <IndexEntry>
{
  
    public DocumentIndex (){
    super ();
}

public void addWord (String word, int num) {
    get (word, num);
}
}
