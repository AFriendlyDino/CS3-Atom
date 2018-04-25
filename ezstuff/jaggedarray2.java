import java.util.ArrayList;
import java.util.Arrays;
public class jaggedarray2{
  public static void main(String[] qehynpiwufvrgugb){
    //3rd instance of jagged array
    int[][] faceroll = new int[0][];
    ArrayList<Integer> nums = new ArrayList<Integer>();
    for(int i = 1; i < 100; i++)
      nums.add((int)(Math.random()*100));
    for(int i = 0; i < 99; i++)
      swap(nums,i,(int)(Math.random()*99));
    int i = 0;
    while(nums.size() > 0){
      int size = (int)(Math.random() * 10) + 1;
      if(size > nums.size())
        size = nums.size();
      faceroll = makearraylonger(faceroll);
      faceroll[i] = new int[size];
      for(int x = 0; x < size; x++){
        faceroll[i][x] = nums.get(0);
        nums.remove(0);
      }
      i++;
    }
    print2DArray(faceroll);
    System.out.println("the sum of all of the values in the array are: " + sumallints(faceroll));
    System.out.println("found the number 73 " + searchvalue(faceroll,73));
    System.out.println("the amount of times 73 occurs is " + countfrequency(faceroll,73) + " time(s)");
    faceroll[0] = removevalue(faceroll[0],0);
    System.out.println("the 2D array without the deleted value is:");
    print2DArray(faceroll);
    System.out.println("the largest row in the array looks like: " + Arrays.toString(largestrow(faceroll)));
    System.out.println("the largest column in the array looks like: " + Arrays.toString(largestcolumn(faceroll)));
  }
  public static int[] largestcolumn(int[][] array){
    int sum = 0;
    int largestsum = 0;
    int largestspot = 0;
    for(int i = 0; i < 10; i++){
      for(int x = 0; x < array.length; x++){
        if(array[x].length > i)
          sum+= array[x][i];
      }
      if(sum > largestsum){
        largestsum = sum;
        largestspot = i;
      }
      sum = 0;
    }
    //creates the array that is the largest column
    int[] newcolumn = new int[array.length];
    for(int i = 0; i < newcolumn.length; i++){
      if(array[i].length > largestspot)
        newcolumn[i] = array[i][largestspot];
      else
        newcolumn[i] = 0;
    }
    return newcolumn;
  }
  public static int[] largestrow(int[][] array){
    int largestsum = 0;
    int largestspot = 0;
    int sum = 0;
    for(int i = 0; i < array.length; i++){
      for(int x = 0; x < array[i].length; x++){
        sum+= array[i][x];
      }
      if(sum > largestsum){
        largestsum = sum;
        largestspot = i;
      }
      sum = 0;
    }
    return array[largestspot];
  }
  public static int[] removevalue(int[] row, int spot){
    int[] newrow = new int[row.length-1];
    int x = 0;
    for(int i = 0; i < row.length; i++){
      if(i == spot)
        i++;
      if(i < row.length)
        newrow[x] = row[i];
      x++;
    }
    return newrow;
  }
  public static int countfrequency(int[][] array, int tofind){
    int answer = 0;
    for(int i = 0; i < array.length; i++){
      for(int x = 0; x < array[i].length; x++){
        if(array[i][x] == tofind)
          answer++;
      }
    }
    return answer;
  }
  public static String searchvalue(int[][] array, int tofind){
    for(int i = 0; i < array.length; i++){
      for(int x = 0; x < array[i].length; x++){
        if(array[i][x] == tofind)
          return "(" + i + "," + x + ")";
      }
    }
    return "nowhere";
  }
  public static int sumallints(int[][] array){
    int answer = 0;
    for(int i = 0; i < array.length; i++){
      for(int x = 0; x < array[i].length; x++){
        answer+= array[i][x];
      }
    }
    return answer;
  }
  public static int[][] makearraylonger(int[][] original){
    int[][] newarray = new int[original.length + 1][];
    for(int i = 0; i < original.length; i++)
      newarray[i] = original[i];
    return newarray;
  }
  public static void swap(ArrayList<Integer> nums, int x, int y){
    int holder = nums.get(x);
    nums.set(x,nums.get(y));
    nums.set(y,holder);
  }
  public static void print2DArray(int[][] array){
    for(int i = 0; i < array.length; i++)
    {
        System.out.println(Arrays.toString(array[i]));
    }
  }
}
