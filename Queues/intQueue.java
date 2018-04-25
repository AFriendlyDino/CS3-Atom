import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class intQueue
{
  private ArrayList<Integer> kys;
  public intQueue()
  {
    kys = new ArrayList<Integer>();
  }

  public void add(int item)
  {
    kys.add(item);
  }

  public int remove()
  {
    int i = kys.get(0);
    kys.remove(0);
    return i;
  }

  public boolean isEmpty()
  {
    if(kys.size() > 0)
      return false;
    return true;
  }

  public int peek()
  {
    int i = kys.get(0);
    return i;
  }

  public String toString()
  {
    String answer = "";
    for(int i = 0; i < kys.size(); i++)
      answer+= " " + kys.get(i);
    return answer;
  }
}
