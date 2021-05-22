package sorting;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int array[]={5,1,9,2,6,3,4,8,7};
        for(int i=1;i<array.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(array[j]<array[j-1])
                {
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        for(int k : array)
        {
            System.out.print(k+" ");
        }

    }
}
