import java.util.Scanner;
import java.io.*;
public class MazeMaker
{
  MazeTile[][] tilelist;
  int[] startcords;
  int[] endcords;
  int x;
  int y;
  public MazeMaker(String filename)
  {
    try
    {
//reads in specified file then converts it to a 2D array of characters
      Scanner scan = new Scanner(new File(filename));
      int row = (scan.nextInt()*2)+1;
      int column = (scan.nextInt()*2)+1;
      char[][] originalmaze = new char[column][row];

      scan.nextLine();

      for(int z = 0; scan.hasNextLine() == true; z++)
      {
        String str = scan.nextLine();
        for(int i = 0; i < str.length(); i++)
        {
          originalmaze[z][i] = str.charAt(i);
        }
      }
//converts originalmaze into 2D MazeTile list
//also finds the start and end cords of the maze
      tilelist = new MazeTile[column][row];
      for(int z = 0; z < tilelist.length; z++)
      {
        for(int i = 0; i < tilelist[0].length; i++)
        {
          tilelist[z][i] = new MazeTile(originalmaze[z][i]);
          if(tilelist[z][i].isEnd() == true)
            endcords = new int[]{z,i};
          if(tilelist[z][i].isStart() == true)
          {
            startcords = new int[]{z,i};
            x = startcords[0];
            y = startcords[1];
          }
        }
      }

    }
    catch(FileNotFoundException e)
    {
      System.out.println("File not found");
    }
  }

  public void printArray()
  {
    for(int z = 0; z < tilelist.length; z++)
    {
      for(int i = 0; i < tilelist[z].length; i++)
      {
        System.out.print(tilelist[z][i].toChar());
      }
      System.out.println("");
    }
  }

//returns start, or end co-ordinates
  public int[] getStartCords()
  {
    return startcords;
  }
  public int[] getEndCords()
  {
    return endcords;
  }

//gets current x and y values
  public int getx()
  {
    return x;
  }
  public int gety()
  {
    return y;
  }

//checks to see if a tile is a valid moving place in the specified direction
  public boolean isupValid()
  {
    if(tilelist[x][y+1].canVisit() == true)
      return true;
    return false;
  }
  public boolean isdownValid()
  {
    if(tilelist[x][y-1].canVisit() == true)
      return true;
    return false;
  }
  public boolean isleftValid()
  {
    if(tilelist[x-1][y].canVisit() == true)
      return true;
    return false;
  }
  public boolean isrightValid()
  {
    if(tilelist[x+1][y].canVisit() == true)
      return true;
    return false;
  }

//either makes a move and returns the direction it moved or returns DEAD END
  public String makeMove()
  {
    if(isleftValid() == true)
    {
      x--;
      tilelist[x][y].visit();
      return "LEFT";
    }
    else if(isupValid() == true)
    {
      y++;
      tilelist[x][y].visit();
      return "UP";
    }
    else if(isrightValid() == true)
    {
      x++;
      tilelist[x][y].visit();
      return "RIGHT";
    }
    else if(isdownValid() == true)
    {
      y--;
      tilelist[x][y].visit();
      return "DOWN";
    }
    return "DEAD END";
  }

  public void backtrack(String s)
  {
    if(s.equals("LEFT"))
    {
      tilelist[x][y].setChar(' ');
      x++;
    }
    if(s.equals("UP"))
    {
      tilelist[x][y].setChar(' ');
      y--;
    }
    if(s.equals("RIGHT"))
    {
      tilelist[x][y].setChar(' ');
      x--;
    }
    if(s.equals("DOWN"))
    {
      tilelist[x][y].setChar(' ');
      y++;
    }
  }

}
