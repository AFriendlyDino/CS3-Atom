import java.util.Arrays;
public class BigOSorts
{
  private static int bigO = 0;
  public static void main(String []args)
  {
    int[] selectionTest = selectionSort(10);
    bigO = 0;
    int[] insertionTest = insertionSort(10);
    bigO = 0;
    int[] mergeTest = mergeSort(10);
  }

  public static int[] mergeSort(int k)
  {
    int[] answer = new int[k];
    for(int i = 0; i < k; i++)
    {
      answer[i] = (int)(Math.random() * k) + 1;
    }


    return answer;
  }

  public static int[] merge(int[] x, int[] y)
  {
    int[] answer = new int[x.length+y.length];

  }

  public static int[] insertionSort(int k)
  {
    int[] answer = new int[k];
    for(int i = 0; i < k; i++)
    {
      answer[i] = (int)(Math.random() * k) + 1;
    }

    for(int i = 0; i < answer.length; i++)
    {
      int x = answer[i];
      for(int z = i; z >= 0; z--)
      {
        bigO++;
        if(x < answer[z-1])
        {
          answer[z] = answer[z-1];
          answer[z-1] = x;
          break;
        }
        answer[z] = answer[z-1];
      }
    }
    return answer;
  }

  public static int[] selectionSort(int k)
  {
    int[] answer = new int[k];
    for(int i = 0; i < k; i++)
    {
      answer[i] = (int)(Math.random() * k) + 1;
    }

    for(int i = 0; i < answer.length; i++)
    {
      int x = i;
      for(int z = i+1; z < answer.length; z++)
      {
        bigO++;
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
