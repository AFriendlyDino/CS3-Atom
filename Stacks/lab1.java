import java.util.Stack;
import java.util.Arrays;
public class lab1
{
  public static void main(String[] args)
  {
    String[] arr1 = new String[]{"a","b","c","d","e","f","g","h","i"};
    System.out.println(arr1.toString());
    System.out.println(stack(arr1));
  }

  public static Stack<String> stack(String[] arr1)
  {
    Stack<String> kys = new Stack<String>();
    for(int i = 0; i < arr1.length; i++)
      kys.push(arr1[i]);
    return kys;
  }
}
