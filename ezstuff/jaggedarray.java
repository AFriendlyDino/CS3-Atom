import java.util.ArrayList;
import java.util.Arrays;
public class jaggedarray
{
  public static void main(String[] gasdlbvuyjhyng)
  {
    //1st instance of jagged array
    int[][] jagrar = new int[10][];
    for(int i = 0; i < 10; i++)
      jagrar[i] = new int[i];
    //2nd instance of jagged array
    int[][] jagex = new int[10][];
    for(int i = 0; i < 10; i++)
      jagex[i] = new int[(int)(Math.random()*10) + 1];
    for(int i = 0; i < 10; i++){
      for(int x = 0; x < jagex[i].length; x++){
        jagex[i][x] = (int)(Math.random()*99) + 1;
      }
    }
    //3rd instance of jagged array
    int[][] rawrXD = new int[0][];
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int i = 1; i < 100; i++)
      nums.add(i);
    for(int i = 0; i < 99; i++)
      swap(nums,i,(int)(Math.random()*99));
    System.out.println(nums.toString());

    int i = 0;
    while(nums.size() > 0){
      int size = (int)(Math.random() * 10) + 1;
      if(size > nums.size())
        size = nums.size();
      rawrXD = makearraylonger(rawrXD);
      rawrXD[i] = new int[size];
      for(int x = 0; x < size; x++){
        rawrXD[i][x] = nums.get(0);
        nums.remove(0);
      }
      i++;
    }
    print2DArray(rawrXD);
  }

  public static int[][] makearraylonger(int[][] original){
    int[][] newarray = new int[original.length + 1][];
    for(int i = 0; i < original.length; i++)
      newarray[i] = original[i];
    return newarray;
  }
  public static void swap(ArrayList<Integer> nums, int x, int y)
  {
    int holder = nums.get(x);
    nums.set(x,nums.get(y));
    nums.set(y,holder);
  }
  public static void print2DArray(int[][] array)
  {
    System.out.println();
    System.out.println("The stuff underneath this is the jagged array");
    for(int i = 0; i < array.length; i++)
    {
        System.out.println(Arrays.toString(array[i]));
    }
  }
}
