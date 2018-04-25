import java.util.LinkedList;
import java.util.PriorityQueue;
public class lab2
{
  public static void main(String[] args)
  {
    PriorityQueue<String> kys = new PriorityQueue<String>();
    kys.add("one");
    kys.add("two");
    kys.add("three");
    kys.add("four");
    kys.add("five");
    kys.add("six");
    kys.add("seven");
    int length = kys.size();
    for(int i = 0; i < length; i++)
    {
      System.out.print(kys.remove() + ", ");
    }
  }
}
