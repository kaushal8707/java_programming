package Patterns;
/*
      1 2 3 4 5
       2 3 4 5
        3 4 5
         4 5
          5
*/
public class Pattern8
{
    public static void main(String[] args)
    {
       for(int i=0;i<5;i++)
       {
           for(int k=0;k<i;k++)
           {
               System.out.print(" ");
           }
           for(int j=0;j<5-i;j++)
           {
               System.out.print(j+1+" ");
           }
           System.out.println();
       }
    }
}
