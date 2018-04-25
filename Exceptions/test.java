public class test
{
  public static void main(String args[])
  {
    char a = 'a';
    char b = 'b';
    char c = 'c';
    try
    {
      System.out.println("letter is " + a);
      lookatword(a);
      System.out.println("letter is " + b);
      lookatword(b);
      System.out.println("letter is " + c);
      lookatword(c);
    }
    catch(BadInputException e)
    {
      System.out.println("that letter suks, use a different letter");
      e.printStackTrace();
    }

  }

  public static void lookatword(char s) throws BadInputException
  {
    if(s == 'c')
      throw new BadInputException(s);
  }
}
