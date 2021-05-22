package programs;
public class MaxAndMinfromArray
{
    public static void main(String[] args)
    {
           int array[]={7,1,9,4,2,6,3,8,5};
           int max=array[0];
           int min=array[0];
           for(int i=0;i<array.length;i++)
           {
               if(array[i]>max)
               {
                   max=array[i];
               }
               if(array[i]<min)
               {
                   min=array[i];
               }
           }
           System.out.print(max+"    "+min);
    }
}
