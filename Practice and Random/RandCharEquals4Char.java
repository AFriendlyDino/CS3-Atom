public class RandCharEquals4Char
{
    public static void main (String args[])
    {
        int count = 0;
        int x = 0;
        char[] kys = new char[4];
        char[] kysreal = new char[]{'c','a','t','s'};
        while(kys[0]!=kysreal[0]&&kys[1]!=kysreal[1]&&kys[2]!=kysreal[2]&&kys[3]!=kysreal[3])
        {
            for(int i = 0; i < kys.length; i++)
            {
            
                x = (int)(Math.random() *27) + 97;
                kys[i] = (char)x;
            }
            count++;
        }
        System.out.println("It took " + count + " tries to get a matching string");
    }
}
