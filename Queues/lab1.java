import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class lab1
{
  public static void main(String[] args)
  {
    Queue<String> kyq = new LinkedList<String>();
    Stack<String> kys = new Stack<String>();
    kyq.add("one");
    kyq.add("two");
    kyq.add("three");
    kyq.add("two");
    kyq.add("one");
    int length = kyq.size();
    kys.add("one");
    kys.add("two");
    kys.add("three");
    kys.add("two");
    kys.add("one");
    int answer = 0;
    for(int i = 0; i < length; i++)
    {
      if(kys.pop().equals(kyq.remove()))
        answer++;
    }
    if(answer == length)
      System.out.println("It is a palindrome");
    else
      System.out.println("It is not a palindrome");
  }
}
