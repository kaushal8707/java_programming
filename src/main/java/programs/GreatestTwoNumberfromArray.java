package programs;
public class GreatestTwoNumberfromArray
{
    public static void main(String[] args)
    {
           int array[]={7,1,9,4,2,6,3,8,5};
           int max1=array[0];
           int max2=array[0];
           for(int i=0;i<array.length;i++)
           {
               if(array[i]>max1)
               {
                   max2=max1;
                   max1=array[i];
               }
               else if(array[i]>max2)
               {
                   max2=array[i];
               }
           }
           System.out.print(max1+"    "+max2);
    }
}
