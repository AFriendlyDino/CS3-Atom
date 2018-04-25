import java.util.ArrayList;
class lab4
{
  private ArrayList<Integer> array;
  private int size;
  public lab4()
  {
    array = new ArrayList<Integer>();
    size = 0;
  }
  public void push(int item)
  {
    array.add(item);
    size++;
  }
  public int pop()
  {
    size--;
    return array.remove(array.size()-1);
  }
  public boolean isEmpty()
  {
    if(size == 0)
      return true;
    return false;
  }
  public int peek()
  {
    return array.get(array.size()-1);
  }
  public String toString()
  {
    return array.toString();
  }
}
