package sorting;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int array[]={5,1,9,2,6,3,4,8,7};
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j+1]<array[j])
                {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int a:array)
        {
            System.out.println(a+" ");
        }

    }
}
