public class lab4runner
{
  public static void main(String[] args)
  {
    lab4 stack = new lab4();
    stack.push(4);
    System.out.println(stack.peek());
    stack.push(216720964);
    while(stack.isEmpty() == false)
    {
      System.out.println(stack.toString());
      stack.pop();
    }
    System.out.println(stack.toString());
  }
}
