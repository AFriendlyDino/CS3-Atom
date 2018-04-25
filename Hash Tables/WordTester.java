import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.*;

public class WordTester
{
	public static void main(String[] args)
	{
		try
    {
			HashTable table = new HashTable();

			Scanner scan = new Scanner(new File("words.dat"));

			for(int i = scan.nextInt(); i > 0; i--)
      {
        scan.nextLine();
        table.add(new Word(scan.next()));
      }

			System.out.println(table.toString());
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Specified data file could not be found");
		}
	}
}
