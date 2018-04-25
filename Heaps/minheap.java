public class minheap
{
  public static void main(String[] aegs)
  {
    int[] heap = new int[20];
    heap = createHeap();
    for(int z = 0; z < 20; z++)
    {
      for(int i = 0; i < heap.length; i++)
      {
        if(i > 0 && heap[(i-1)/2] > heap[i])
        {
          swap(heap,(i-1)/2,i);
        }
        if(i > 1 && heap[(i-2)/2] > heap[i])
        {
          swap(heap,(i-2)/2,i);
        }
      }
    }
    System.out.println(printArray(heap));
  }



  public static int[] createHeap()
  {
    int[] nums = {58, 80,2, 36,70,25,41, 80,64,98,15,68,96,65,77, 45,13,10,85,31};
    int[] heap = new int[20];
    for(int i = 0; i < heap.length; i++)
    {
      heap[i] = nums[i];
      if(i > 0 && heap[(i-1)/2] > heap[i])
      {
        swap(heap,(i-1)/2,i);
      }
      if(i > 1 && heap[(i-2)/2] > heap[i])
      {
        swap(heap,(i-2)/2,i);
      }
      System.out.println(printArray(heap));
    }
    return heap;
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
