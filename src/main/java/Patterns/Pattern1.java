package Patterns;
/*
1
23
456
78910
*/

public class Pattern1
{
    static int k=1;
    public static void main(String[] args)
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
