import java.util.Stack;
public class lab2
{
  public static void main(String[] args)
  {
    Stack<String> kys = new Stack<String>();
    Stack<String> kys2 = new Stack<String>();
    kys.add("(");
    kys.add("a");
    kys.add("b");
    kys.add("c");
    kys.add("{");
    kys.add("*");
    kys.add("d");
    kys.add("e");
    kys.add("f");
    kys.add(")");
    int length = kys.size();
    boolean balanced = true;
    for(int i = 0; i < length; i++)
    {
      if(kys.peek().equals("}"))
        kys2.add(kys.peek());
      if(kys.peek().equals(")"))
        kys2.add(kys.peek());
      if(kys.peek().equals("]"))
        kys2.add(kys.peek());
      if(kys.peek().equals(">"))
        kys2.add(kys.peek());

      if(kys.peek().equals("{") && kys2.peek().equals("}"))
      {
        kys2.pop();
        kys.pop();
        i++;
      }
      else if(kys.peek().equals("(") && kys2.peek().equals(")"))
      {
        kys2.pop();
        kys.pop();
        i++;
      }
      else if(kys.peek().equals("[") && kys2.peek().equals("]"))
      {
        kys2.pop();
        kys.pop();
        i++;
      }
      else if(kys.peek().equals("<") && kys2.peek().equals(">"))
      {
        kys2.pop();
        kys.pop();
        i++;
      }
      else if(kys.peek().equals("{"))
        balanced = false;
      else if(kys.peek().equals("("))
        balanced = false;
      else if(kys.peek().equals("["))
        balanced = false;
      else if(kys.peek().equals("<"))
        balanced = false;
      else
        kys.pop();

    }
    System.out.println("The system is balanced: " + balanced);
  }
}
