import java.util.Map;
import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
public class translator
{
  public static void main(String[] yeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeet)
  {
    /* how much wood could a wood chuck chuck if a wood chuck could chuck wood */
    try
    {
      Scanner scan = new Scanner(new File("spantoeng.dat"));
      Map<String,String> list = new HashMap<String,String>();
      for(int i = scan.nextInt(); i > 0; i--)
        list.put(scan.next(),scan.next());
      String translatedline = "";
      while(scan.hasNext() == true)
      {
        Scanner line = new Scanner(scan.nextLine());
        while(line.hasNext() == true)
        {
          translatedline+= list.get(line.next()) + " ";
        }
        System.out.println(translatedline);
        translatedline = "";
      }

    }
    catch(FileNotFoundException e)
    {
      System.out.println("File not found");
    }
  }
}
