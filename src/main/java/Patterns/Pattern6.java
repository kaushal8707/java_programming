package Patterns;
/*
        1
       2 3
      4 5 6
     7 8 9 10
    11 12 13 14

 */
public class Pattern6
{
    static int c=1;
    public static void main(String[] args)
    {
       for(int i=0;i<5;i++)
       {
           for(int j=5-i;j>0;j--)
           {
               System.out.print(" ");
           }
           for(int k=0;k<=i;k++)
           {
               System.out.print(c+" ");
               c++;
           }
           System.out.println();
       }
    }
}
