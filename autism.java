import java.util.Scanner;
import java.io.*;
public class autism
{
  public static void main(String[] literalautism) throws IOException
  {
    for(int i = 0; i < literalautism.length; i++)
    {
      fuckitup(literalautism[i]);
    }
  }

  public static void fuckitup(String tobefucked) throws IOException
  {
    int nextfile = 0;
    Scanner scan = new Scanner(new File(tobefucked));
    PrintWriter pimp = null;
    for(int i = tobefucked.length()-1; i >= 0; i--)
    {
      if(tobefucked.charAt(i) == ')' && i != 0)
      {
        nextfile = Integer.parseInt(tobefucked.charAt(i-1)+"");
      }
    }
    if(nextfile != 0)
    {
      pimp = new PrintWriter(new FileWriter(tobefucked.substring(0, tobefucked.lastIndexOf("(")) + "(" + (nextfile+1) + ").java"));
    }
    else
    {
      pimp = new PrintWriter(new FileWriter(tobefucked.substring(0, tobefucked.lastIndexOf(".")) + "(1).java"));
    }

    while(scan.hasNextLine())
    {
      pimp.print(scan.nextLine().trim());
    }
    pimp.close();
    System.out.println("Congratulations, File is Fucked");
  }
}
