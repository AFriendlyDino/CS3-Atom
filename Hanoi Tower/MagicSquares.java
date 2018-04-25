import java.util.Scanner;
import java.util.Arrays;
public class MagicSquares
{
  static int[][] square;
  public static void main(String[] kys)
  {
    int average = 0;
    int count = 0;
    int i = 0;
    while(i < 5)
    {
      while(isMagic(square)==false)
      {
        square = new int[3][3];
        makeSquare(square);
        count++;
      }
      average+= count;
      count = 0;
      i++;
    }
    System.out.println("the average amount of times taken to complete a perfect square was " + average/i);
  }
  public static boolean isMagic(int[][] magicsquare)
  {
    if(magicsquare == null)
      return false;
    if(checkRow(magicsquare, 0) == true && checkRow(magicsquare, 1) == true && checkRow(magicsquare, 2) == true && checkCollumn(magicsquare, 0) == true && checkCollumn(magicsquare, 1) == true && checkCollumn(magicsquare, 2) == true)
      return true;
    return false;
  }
  public static void makeSquare(int[][] magicsquare)
  {
    for(int x = 0; x < 3; x++)
    {
      for(int y = 0; y < 3; y++)
      {
        magicsquare[x][y] = (int)(Math.random()*9) + 1;
      }
    }
  }
  public static boolean checkRow(int[][] magicsquare, int row)
  {
    if(magicsquare[row][0] + magicsquare[row][1] + magicsquare[row][2] == 9)
      return true;
    return false;
  }
  public static boolean checkCollumn(int[][] magicsquare, int collumn)
  {
    if(magicsquare[0][collumn] + magicsquare[1][collumn] + magicsquare[2][collumn] == 9)
      return true;
    return false;
  }

}
