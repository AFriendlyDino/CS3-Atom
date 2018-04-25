import java.util.Arrays;
public class linearsearch
{
  private static int bigO = 0;
  public static void main(String []args)
  {
    int[] test10 = makeTest(10);
    System.out.println("values in an array of 10 are " + Arrays.toString(test10));
    System.out.println(binaryBigO(test10));
    System.out.println(linearBigO(test10));
  }

  public static String binaryBigO(int[] test)
  {
    int best = 100;
    int worst = 0;
    int averagebigO = 0;
    int rand = 0;
    int x = 0;
    while(x < 10)
    {
      rand = (int)(Math.random() * test.length) + 1;
      binarysearch(test,0,test.length-1,rand);
      x++;
      if(bigO < best)
        best = bigO;
      if(bigO > worst)
        worst = bigO;
      averagebigO+= bigO;
      bigO = 0;
    }
    averagebigO = averagebigO / 10;
    return "best: "+best+", average: "+averagebigO+", worst: "+worst;
  }

  public static int binarysearch(int[] list, int x, int y, int val)
  {
    int middle = (x+y)/2;
    if(y < x)
      return -1;
    if(val == list[middle])
    {
      bigO++;
      return middle;
    }
    if(val < list[middle])
    {
      bigO++;
      return binarysearch(list,0,middle-1,val);
    }
    else if(val > list[middle])
    {
      bigO++;
      return binarysearch(list,middle+1,y,val);
    }

    return -1;
  }

  public static String linearBigO(int[] test)
  {
    int best = 100;
    int worst = 0;
    int averagebigO = 0;
    int rand = 0;
    int x = 0;
    while(x < 10)
    {
      rand = (int)(Math.random() * test.length) + 1;
      linearsearch(test,rand);
      if(bigO < best)
        best = bigO;
      if(bigO > worst)
        worst = bigO;
      averagebigO+= bigO;
      bigO = 0;
      x++;
    }
    averagebigO = averagebigO / 10;
    return "best: "+best+", average: "+averagebigO+", worst: "+worst;
  }

  public static int linearsearch(int[] list, int val)
  {
    int x = 0;
    while(x < list.length)
    {
      if(list[x] == val)
        return x;
      x++;
      bigO++;
    }
    return -1;
  }

  public static int[] makeTest(int k)
  {
  //creates array with an amount of values between 1 and the value of the array
    int[] answer = new int[k];
    for(int i = 0; i < k; i++)
    {
      answer[i] = (int)(Math.random() * k) + 1;
    }
    //sorts said array using a selection sort
    for(int i = 0; i < answer.length; i++)
    {
      int x = i;
      for(int z = i+1; z < answer.length; z++)
      {
        if(answer[z] < answer[x])
        {
          x = z;
        }
      }
      swap(answer,x,i);
    }
    return answer;
  }
  public static void swap(int[] n, int x, int y)
  {
    int z = n[x];
    n[x] = n[y];
    n[y] = z;
  }
}
