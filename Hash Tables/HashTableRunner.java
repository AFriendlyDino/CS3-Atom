import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.*;

public class HashTableRunner
{
  public static void main(String[] args)
  {
		try
    {
			HashTable table = new HashTable();

			Scanner scan = new Scanner(new File("numbers (1).dat"));

			for(int i = scan.nextInt(); i > 0; i--)
      {
        scan.nextLine();
        table.add(new Number(scan.nextInt()));
      }

			System.out.println(table.toString());
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Specified file to be read could not be found");
		}
  }
}
