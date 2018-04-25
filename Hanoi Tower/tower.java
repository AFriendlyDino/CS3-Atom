import java.util.Scanner;
import java.util.Stack;
public class tower
{
  public static void main(String[] args)
  {
    Stack<Integer> towerA = new Stack<Integer>();
    Scanner kys = new Scanner(System.in);
    System.out.println("Enter how many blocks there will be");
    for(int length = kys.nextInt(); length > 0; length--)
    {
      towerA.push(length);
    }
    new move(towerA);
  }
}
