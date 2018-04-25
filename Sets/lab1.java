import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class lab1
{
  public static void main(String[] args)
  {
    boolean test = false;
    ArrayList<String> original = new ArrayList<String>(Arrays.asList("a","b","c","e","f","g","h","a","b","c","d","e","f","g","h","i","j","k"));
    Set<String> kys = new HashSet<String>();
    ArrayList<String> uniques = new ArrayList<String>();
    ArrayList<String> dupes = new ArrayList<String>();
    for(int i = 0; i < original.size(); i++)
    {
      test = kys.add(original.get(i));
      if(test == false)
        dupes.add(original.get(i));
      else
        uniques.add(original.get(i));
    }
    System.out.println("Original : " + original.toString());
    System.out.println("Uniques : " + uniques.toString());
    System.out.println("Dupes : " + dupes.toString());
  }
}
