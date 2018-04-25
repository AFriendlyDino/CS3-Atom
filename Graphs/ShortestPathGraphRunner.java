import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class ShortestPathGraphRunner
{
  public static void main(String[] yeeet) throws IOException
  {
    try
    {
      ShortestPathGraph guy = new ShortestPathGraph();
      Scanner file = new Scanner(new File("graph1.dat"));
      int length = file.nextInt();
      file.nextLine();
      /*
      while(file.hasNext() == true)
      {*/
        Scanner line = new Scanner(file.nextLine());
        ArrayList<String> connections = new ArrayList<String>();
        while(line.hasNext() == true)
        {
          connections.add(line.next());
        }
        System.out.println(guy.solve(file.next(),connections));
      //}
    }

    catch(FileNotFoundException e)
    {
      System.out.println("Data file not found");
    }
  }
}
