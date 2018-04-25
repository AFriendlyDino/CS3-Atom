import java.util.HashMap;
import java.util.Map;
public class RunningTimes{
  Map<String,double[]> list;
  public RunningTimes(){
    list = new HashMap<String,double[]>();
    //map of event versus times for those events
  }
  public void addEventTime(String event, double time){
    if(!list.containsKey(event)){
      list.put(event, new double[1]);
      list.get(event)[0] = time;
    }
    else{
      double[] newarray = new double[list.get(event).length+1];
      for(int i = 0; i < list.get(event).length; i++){
        newarray[i] = list.get(event)[i];
      }
      newarray[newarray.length-1] = time;
      list.put(event,newarray);
    }
  }
}
