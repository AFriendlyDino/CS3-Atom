import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
		table = new LinkedList[10];
		for(int i = 0; i < table.length; i++)
			table[i] = new LinkedList<Object>();
	}

	public void add(Object obj)
	{
		int i = obj.hashCode();
		if(table[i] == null)
		{
			table[i] = new LinkedList<Object>();
			table[i].add(obj);
		}
		else if(table[i].contains(obj) == false)
			table[i].add(obj);
	}

	public String toString()
	{
		String output="HASHTABLE\n";
    for(int i = 0; i < table.length; i++)
		{
      output += "bucket " + i + " ";
      output += Arrays.toString(table[i].toArray()) + "\n";
    }
    return output;
	}
}
