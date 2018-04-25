public class RandCharEquals
{
    public static void main (String args[])
    {
        int count = 0;
        int x = 0;
        char[] kys = new char[3];
        char[] kysreal = new char[]{'c','a','t'};
        while(kys[0]!=kysreal[0]&&kys[1]!=kysreal[1]&&kys[2]!=kysreal[2])
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
