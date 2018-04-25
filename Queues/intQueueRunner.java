public class intQueueRunner
{
  public static void main(String[] args)
  {
    intQueue kys = new intQueue();

    for(int i = 0; i < 10; i++)
    {
      kys.add(i);
    }
    System.out.println(kys.toString());
    System.out.println(kys.remove() + " removed from queue");
    System.out.println(kys.toString());
    System.out.println(kys.peek() + " is at the front of the queue");
    while(kys.isEmpty() == false)
      kys.remove();
    System.out.println("queue is now empty");
  }
}
