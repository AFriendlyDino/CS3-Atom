public class maxHeapDelete
{
  public static void main(String[] andIHaveWalkedFiveHundredMilesAndIWILLWALKFIVEHUNDREDMORE)
  {
    int[] nums = {58, 80,2, 36,70,25,41, 80,64,98,15,68,96,65,77, 45,13,10,85,31};
    int[] heap = new int[20];
    for(int i = 0; i < heap.length; i++)
    {
      heap[i] = nums[i];
      if(i > 0 && heap[(i-1)/2] < heap[i])
        swap(heap,(i-1)/2,i);
      if(i > 1 && heap[(i-2)/2] < heap[i])
        swap(heap,(i-1)/2,i);
    }
    System.out.print("the original heap is: ");
    System.out.println(printArray(heap));
    System.out.println("deleting first element and resorting the heap");
    swap(heap,0,19);
    int[] newnums = new int[19];
    for(int i = 0; i < 19; i++)
      newnums[i] = heap[i];

    for(int i = 0; i < newnums.length; i++)
    {
      if(i > 0 && newnums[(i-1)/2] < newnums[i])
        swap(newnums,(i-1)/2,i);
      if(i > 1 && newnums[(i-2)/2] < newnums[i])
        swap(newnums,(i-1)/2,i);
      System.out.println(printArray(newnums));
    }
  }



  public static void swap(int[] array, int one, int two)
  {
    int holder = array[one];
    array[one] = array[two];
    array[two] = holder;
  }
  public static String printArray(int[] array)
  {
    String answer = "[";
    for(int i = 0; i < array.length; i++)
      answer+= array[i] + ",";
    return answer + "]";
  }
}
