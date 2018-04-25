import java.util.ArrayList;
public class OperationsWithArrayLists
{
  public static void main(String args[])
  {
    //runs all test cases and sets up values of objects
    Arraylist<Integer> kys = new Arraylist<Integer>();
    int x = 0;
    while(x < 10)
    {
      kys.add((int)(Math.random() * 11));
      x++;
    }
    Arraylist<Integer> kys2 = new Arraylist<Integer>();
    x = 0;
    while(x < 10)
    {
      kys2.add((int)(Math.random() * 11));
      x++;
    }

    System.out.println("traverse: " + traverse(kys, 3));
    System.out.println("traverse: " + traverse(kys2, 5));
    System.out.println("traverse: " + traverse(kys, 8));

    System.out.println("search: " + search(kys, 3));
    System.out.println("search: " + search(kys2, 5));
    System.out.println("search: " + search(kys, 8));

    System.out.println("insert: " + insert(kys, 3, 5));
    System.out.println("insert: " + insert(kys2, 7, 2));
    System.out.println("insert: " + insert(kys, 8, 9));

    System.out.println("delete: " + delete(kys, 3));
    System.out.println("delete: " + delete(kys2, 7));
    System.out.println("delete: " + delete(kys, 8));

    System.out.println("sorting 1st array");
    sort(kys);
    System.out.println("sorting 2nd array");
    sort(kys2);

    System.out.println("merging the two arrays into one");
    merge(kys,kys2);
  }

  public static int traverse(ArrayList<Integer> kys, int n)
  {
    //return a value of an integer at a spot n
    return kys.get(n);
  }

  public static int search(ArrayList<Integer> kys, int n)
  {
    //return the spot of the value n
    for(int i : kys)
      if(i == n)
        return i;

    return -1;
  }

  public static void insert(ArrayList<Integer> kys, int n, int spot)
  {
    //insert a value at spot n
    kys.add(n,spot);
  }

  public static int delete(ArrayList<Integer> kys, int n)
  {
    //delete a value at spot n and returns the deleted value
    int x = kys.get(n);
    kys.delete(n);
    return x;
  }

  public static void sort(ArrayList<Integer> kys)
  {
    //sorts the given arraylist
    for(int i = 0; i < kys.size(); i++)
    {
      int x = i;
      for(int z = i+1; z < kys.size(); z++)
      {
        if(kys.get(z) < kys.get(x))
        {
          x = z;
        }
      }
      swap(kys,x,i);
    }
  }

  public static void swap(int[] n, int x, int y)
  {
    int z = n.get(x);
    n.set(x) = n.get(y);
    n.set(y) = z;
  }

  public static void merge(ArrayList<Integer> kys, ArrayList<Integer> kys2)
  {
    //merges 2 arraylists into a the first arraylist containing the values of both
    for(int i = 0; i < kys2.size(); i++)
    {
      kys.add(kys2.get(i));
    }
  }
}
