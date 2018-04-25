public class MazeTile
{
  private boolean isobstacle;
  private char newtile;
  private boolean visited;
  private boolean start;
  private boolean end;

  public MazeTile(char tile)
  {
    if((tile == '-' ) || (tile == '+' ) || (tile == '|'))
    {
      isobstacle = true;
      newtile = 'X';
    }
    else if(tile == '*')
    {
      newtile = '*';
      start = true;
    }
    else if(tile == 'O')
    {
      newtile = 'O';
      end = true;
    }
    else
    {
      newtile = ' ';
    }
  }

  public void visit()
  {
    visited = true;
    newtile = '*';
  }

  public boolean canVisit()
  {
    if(visited == true || isobstacle == true)
      return false;
    return true;
  }

  public boolean isEnd()
  {
    return end;
  }

  public boolean isStart()
  {
    return start;
  }

  public char toChar()
  {
    return newtile;
  }

  public void setChar(char tile)
  {
    newtile = tile;
  }
}
