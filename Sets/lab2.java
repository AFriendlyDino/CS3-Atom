import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class lab2
{
  public static void main(String[] args)
  {
    Set<Integer> odds = new HashSet<Integer>();
    Set<Integer> evens = new HashSet<Integer>();
    ArrayList<Integer> original = new ArrayList<Integer>();
    for(int i = 0; i < 10; i++)
    {
      original.add( (int)(Math.random()*10) );
    }
    for(int x = 0; x < 10; x++)
    {
      if(original.get(x)%2 == 0)
        evens.add(original.get(x));
      if(original.get(x)%2 == 1)
        odds.add(original.get(x));
    }
    System.out.println("The even numbers in the list are: " + evens.toString());
    System.out.println("The odd numbers in the list are: " + odds.toString());

  }
}
