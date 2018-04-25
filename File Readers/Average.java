import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Average
{
  public static void main(String[] args) throws IOException
  {
    try
    {
      BufferedReader bReader = new BufferedReader(new FileReader("average.dat"));
      double sum = 0;
      double average = 0;
      String lineContents;
      ArrayList<Integer> kys = new ArrayList<Integer>();
      while ((lineContents = bReader.readLine())!= null)
      {
        Scanner line = new Scanner(lineContents);
        while(line.hasNext())
        {
          kys.add(Integer.parseInt(line.next()));
        }
      }
      int smallestspot = 0;
      
      for(int i = 0; i < kys.size(); i++)
      {
        if(kys.get(smallestspot) > kys.get(i))
          smallestspot = i;
      }
      kys.remove(smallestspot);
      for(int i = 0; i < kys.size(); i++)
      {
        average+= kys.get(i);
      }
      average = average / kys.size();
      System.out.printf("%.2f is the average of the array list",average);
    }

    catch(FileNotFoundException e)
    {
      System.out.println("File not found");
    }
  }
}
