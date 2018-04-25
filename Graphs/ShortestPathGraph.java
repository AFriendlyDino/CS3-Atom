import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ShortestPathGraph
{
  public String solve(String tofind, ArrayList<String> c)
  {
    ArrayList<String> used = new ArrayList<String>();
    boolean finished = false;
    ArrayList<String> connections = c;
    Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();

    for(int i = 0; i < connections.size(); i++)
      addConection(map,connections.get(i).substring(0,1),connections.get(i).substring(1));
    String start = tofind.substring(0,1);
    String end = tofind.substring(1);

    return ""+recurse(used,finished,map,start,end);
  }
  public void addConection(Map<String,ArrayList<String>> map, String a, String b)
  {
    if(map.containsKey(a))
      map.get(a).add(b);
    else
    {
      map.put(a,new ArrayList<String>());
      map.get(a).add(b);
    }
    if(map.containsKey(b))
      map.get(b).add(a);
    else
    {
      map.put(b,new ArrayList<String>());
      map.get(b).add(a);
    }
  }
  public int recurse(ArrayList<String> used, boolean finished, Map<String,ArrayList<String>> map, String start, String end)
  {
    System.out.println("Checking " + start);
    if(start.equals(end)){
      finished = true;
      return 1;}
    if(canRecurse(map,start,used))
    {
      System.out.println("Now at " + start + " " + map.get(start));
      System.out.println(used);
      for(int i = 0; i < map.get(start).size(); i++)
      {
        return 1 + recurse(used,finished,map,map.get(start).get(i),end);
      }
    }
    return 0;
  }
  public boolean canRecurse(Map<String,ArrayList<String>> map, String key, ArrayList<String> used)
  {
    for(int i = 0; i < map.get(key).size(); i++)
    {
      if(!used.contains(map.get(key).get(i)))
      {
        System.out.println("adding " + map.get(key).get(i) + " to the used list");
        used.add(map.get(key).get(i));
        return true;
      }
    }
    return false;
  }
}
