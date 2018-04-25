public class stuff
{
  public static void main (String args[])
    {
      int odd = 0;
      int even = 0;
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++)
        {
          int x = (int)(Math.random() * 100);
          arr[i] = x;
        }
        for(int i = 0; i < arr.length; i++)
        {
          if(arr[i]%2 == 0)
            even++;
          else
            odd++;
        }
        System.out.println(even + " even numbers");
        System.out.println(odd + " odd numbers");
    }
}
