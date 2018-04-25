import java.util.Stack;
import java.util.Arrays;
public class MazeSolver
{
  public static void main(String[] args)
  {
    MazeMaker maze = new MazeMaker("bigmaze6.txt");
    maze.printArray();
    Stack<String> moves = new Stack<String>();
    int[] startcords = maze.getStartCords();
    int x = maze.getx();
    int y = maze.gety();
    int[] endcords = maze.getEndCords();
    while(!(x == endcords[0] && y == endcords[1]) )
    {
      moves.add(maze.makeMove());
      if(moves.peek().equals("DEAD END"))
      {
        moves.pop();
        maze.backtrack(moves.pop());
      }
      x = maze.getx();
      y = maze.gety();
      maze.printArray();
    }
    System.out.println("The maze has been solved");
    System.out.println(moves);
  }
}
