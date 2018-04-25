import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Box
{
  public static void main(String[] args) throws IOException
  {
    try
    {
      BufferedReader bReader = new BufferedReader(new FileReader("box.dat"));
      int sum = 0;
      String lineContents;
      while ((lineContents = bReader.readLine())!= null)
      {
        Scanner line = new Scanner(lineContents);
      }
      int linenum = line.nextInt();
      for(int y = 0; y < linenum; y++)
      {
        int letter = line.next();
        int num = line.nextInt();
        for(int i = 0; i < num; i++)
        {
          for(int x = 0; x < num; x++)
          {
            System.out.print(letter);
          }
          System.out.println("");
        }
      }
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File not found");
    }
  }
}
