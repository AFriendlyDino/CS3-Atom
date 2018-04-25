public class operations
{
  public static void main (String args[])
  {
    //do a bunch of random shizwhiz
    int[] kys = new int[]{5,9,3,7,2};
    int[] kys2 = new int[]{3,7,5,8,5};
    System.out.println("array 1 " + toString(kys));
    System.out.println("array 2 " + toString(kys2));
    //merge test case
    int[] kys3 = merge(kys,kys2);
    System.out.println("merge " + toString(kys3));
    //traverse test cases
    System.out.println("traverse " + traverse(kys,1));
    System.out.println("traverse " + traverse(kys2,2));
    System.out.println("traverse " + traverse(kys,3));
    //search test cases
    System.out.println("search " + search(kys,5));
    System.out.println("search " + search(kys,9));
    System.out.println("search " + search(kys2,5));
    //insert test cases
    System.out.println("insert " + toString(insert(kys,3,9)));
    System.out.println("insert " + toString(insert(kys,5,0)));
    System.out.println("insert " + toString(insert(kys2,0,5)));
    //delete test cases
    System.out.println("delete " + toString(delete(kys,2)));
    System.out.println("delete " + toString(delete(kys,4)));
    System.out.println("delete " + toString(delete(kys2,0)));
  }

  public static int traverse(int[] kys, int spot)
  {
    return kys[spot];
  }

  public static int search(int[] kys, int num)
  {
    int pos = 0;
    for(int x : kys)
    {
      if(x == num)
        return pos;
      pos++;
    }
    return -1;
  }

  public static int[] insert(int[] kys, int spot, int num)
  {
    int x = 0;
    int[] kys2 = new int[kys.length + 1];
    for(int i = 0; i < kys.length; i++)
    {
      if(i == spot)
      {
        kys2[i] = num;
        x++;
      }
      kys2[x] = kys[i];
      x++;
    }
    return kys2;
  }

  public static int[] delete(int[] kys, int spot)
  {
    int x = 0;
    int[] kys2 = new int[kys.length - 1];
    for(int i = 0; i < kys2.length; i++)
    {
      if(i == spot)
      {
        x++;
      }
      kys2[i] = kys[x];
      x++;
    }
    return kys2;
  }

  public static int[] merge(int[] kys, int[] kys2)
  {
    int[] kys3 = new int[kys.length + kys2.length];
    int x = 0;
    for(int i = 0; i < kys.length; i++)
    {
      kys3[x] = kys[i];
      x++;
    }
    for(int i = 0; i < kys2.length; i++)
    {
      kys3[x] = kys2[i];
      x++;
    }
    return kys3;
  }

  public static void sort(int[] kys)
  {
    for(int i = 0; i < kys.length; i++)
    {
      int x = i;
      for(int z = i+1; z < kys.length; z++)
      {
        if(kys[z] < kys[x])
        {
          x = z;
        }
      }
      swap(kys,x,i);
    }
  }

  public static void swap(int[] n, int x, int y)
  {
    int z = n[x];
    n[x] = n[y];
    n[y] = z;
  }

  public static String toString(int[] kys)
  {
    String returning = "";
    for(int x : kys)
      returning = returning + " " + x;
    return returning;
  }
}
