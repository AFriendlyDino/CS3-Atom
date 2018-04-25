import java.util.Set;
import java.util.HashSet;
public class lab3
{
  public static void main(String[] yeeeeeeeeeeeeeeeeet)
  {
    //original sets
    Set<Integer> a = new HashSet<Integer>();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);
    Set<Integer> b = new HashSet<Integer>();
    b.add(4);
    b.add(5);
    b.add(6);
    b.add(7);
    b.add(8);

    //sets to be used with union
    Set<Integer> a1 = new HashSet<Integer>();
    a1.addAll(a);
    a1.addAll(b);

    //sets to be used with intersection
    Set<Integer> a2 = new HashSet<Integer>();
    a2.addAll(a);
    a2.retainAll(b);

    //sets to be used with difference A-B
    Set<Integer> a3 = new HashSet<Integer>();
    a3.addAll(a);
    a3.removeAll(b);

    //sets to be used with difference B-A
    Set<Integer> b4 = new HashSet<Integer>();
    b4.addAll(b);
    b4.removeAll(a);

    //sets to be used with Symmmetric difference
    Set<Integer> a5 = new HashSet<Integer>();
    a5.addAll(a);
    a5.addAll(b);
    a5.removeAll(a2);

    System.out.println("Union: " + a1);
    System.out.println("Intersection: " + a2);
    System.out.println("Difference A-B: " + a3);
    System.out.println("Difference B-A: " + b4);
    System.out.println("Symmmetric Difference: " + a5);
  }
}
