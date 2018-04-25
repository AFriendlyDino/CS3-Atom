import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
public class Santa
{
  public static void main(String asdf)
  {
    Map<Child,ArrayList<String>> nicelist = new Map<Child,ArrayList<String>>();
    Map<Child,ArrayList<String>> naughtylist = new Map<Child,ArrayList<String>>();
    Map<Child,Stack<String>> presentlist = new Map<Child,Stack>();

    ArrayList<String> names = new ArrayList<String>(Arrays.asList("bob","bill","michael","minsong","stefan","matt","zarek","cole","sarah","caroline"));
    ArrayList<Child> children = new ArrayList<Child>();

    for(int i = 0; i < 10; i++)
    {
      children.add(new Child(names.get(i),i));
      nicelist.put(children(i), new ArrayList<String>());
      naughtylist.put(children(i), new ArrayList<String>());
      presentlist.put(children(i), new Stack<String>());
    }







    //UI for the santa program
    Scanner kys = new Scanner(System.in);
    int input = 0;
    do{
      System.out.println();
      input = kys.next();
      if(input == 1)
      {
        //adds a nice thing to a persons list
        System.out.println("type in the child that did the nice thing");
        for(Child c : children) System.out.println(c.getHash() + " " c.getName());
        input = kys.nextInt();
        System.out.println("add the nice thing the kid did");
        nicelist.get(input).add(kys.next());
      }
      if(input == 2)
      {
        //adds a naughty thing to a persons list
      }
      if(input == 3)
      {
        //does the weekly naughty or nice checkup
      }
      if(input == 4)
      {
        //shows what presents the kids are getting based on their weekly performances
      }

    } while(input != 0)

  }
}
