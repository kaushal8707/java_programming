package searching;
public class LinearSearch
{
    public static void main(String[] args)
    {
        int array[]={7,1,9,4,2,6,3,8,5};
        int key=3;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==key)
            {
                System.out.println(key+"  Found at position = "+(i+1));
            }
        }
    }


}
