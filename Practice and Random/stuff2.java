public class stuff2
{
  public static void main(String args[])
  {
    int times = 0;
    char[] kys = new char[3];
    char[] realkys = new char['c','a','t'];
    int x = 0;
    while(!kys.equals(realkys))
    {
      for(int i = 0; i < char.length; i++)
      {
        x = (int)(Math.random() * 27) + 97;
        kys[i] = (char)x;
      }
    }
  }
}
