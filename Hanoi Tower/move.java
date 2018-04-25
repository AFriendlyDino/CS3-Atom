import java.util.Stack;
public class move
{
  Stack<Integer> towerA;
  Stack<Integer> towerB;
  Stack<Integer> towerC;
  public move(Stack<Integer> a)
  {
    int x = a.size();
    towerA = a;
    towerB = new Stack<Integer>();
    towerC = new Stack<Integer>();
    magic(towerA, towerC, towerB, x);
  }
  public void magic(Stack<Integer> start, Stack<Integer> end, Stack<Integer> utility, int x)
  {
    if(x == 1)
    {
      end.push(start.pop());
      print();
    }
    else
    {
      magic(start, utility, end, x-1);
      magic(start, end, utility, 1);
      magic(utility, end, start, x-1);
    }
  }
  public void print()
  {
    System.out.println("Tower 1: " + towerA + "\n" +
    "Tower 2: " + towerB + "\n" +
    "Tower 3: " + towerC + "\n");
  }
}
