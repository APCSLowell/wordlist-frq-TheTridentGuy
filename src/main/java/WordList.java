import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int ret = 0;
    for(int i = 0; i < myList.size(); i++){
      if(myList.get(i).length() == len){
        ret++;
      }
    }
    return ret;
  }

  public void removeWordsOfLength(int len)
  {
    int p = 0;
    while(p < myList.size()){
      if(myList.get(p).length() == len){ myList.remove(p); }
        else{ p++; }
    }
  }
}
