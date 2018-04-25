import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;
public class lab3
{
  public static void main(String[] args)
  {
    ArrayList<String> kya = new ArrayList<String>(Arrays.asList("2","7","+","1","2","+","+"));
    System.out.println(kya.toString() + " is the postfix equation");
    Stack<String> kys = new Stack<String>();
    for(int i = 0; i < kya.size(); i++)
    {

      if(kya.get(i).equals("+"))
      {
        kys.push("" + (Double.parseDouble(kys.pop()) + Double.parseDouble(kys.pop())) );
      }
      else if(kya.get(i).equals("-"))
      {
        kys.push("" + (Double.parseDouble(kys.pop()) - Double.parseDouble(kys.pop())) );
      }
      else if(kya.get(i).equals("*"))
      {
        kys.push("" + (Double.parseDouble(kys.pop()) * Double.parseDouble(kys.pop())) );
      }
      else if(kya.get(i).equals("/"))
      {
        kys.push("" + (Double.parseDouble(kys.pop()) / Double.parseDouble(kys.pop())) );
      }
      else
      {
        kys.push(kya.get(i));
      }
    }
    System.out.println(kys.pop() + " is the answer to the postfix equation;");
  }
}
