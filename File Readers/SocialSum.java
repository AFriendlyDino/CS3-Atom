import java.util.Scanner;
import java.io.*;
public class SocialSum
{
  public static void main(String[] args) throws IOException
  {
    try
    {
      BufferedReader bReader = new BufferedReader(new FileReader("social.dat"));
      int sum = 0;
      String lineContents;
      while ((lineContents = bReader.readLine())!= null)
      {
        Scanner line = new Scanner(lineContents);
        line.useDelimiter("-");
        while(line.hasNextInt())
            sum += line.nextInt();
        System.out.println("SS# "+lineContents+" has a sum of "+sum);
        sum = 0;
      }
    }

    catch(FileNotFoundException e)
    {
      System.out.println("File not found");
    }
  }
}
