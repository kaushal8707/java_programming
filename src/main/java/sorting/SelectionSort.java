package sorting;

public class SelectionSort
{
    public static void main(String[] args) {

        int array[]={5,1,9,2,6,3,4,8,7};
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]<array[i])
                {
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        for(int k : array)
        {
            System.out.print(k+" ");
        }

    }
}
