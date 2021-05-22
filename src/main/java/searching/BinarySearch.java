package searching;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int array[]={4,5,6,7,8,9,10,11,12};
        int min=0,max=array.length-1;
        int key=7;
        while(min<=max)
        {
            int middle=(min+max)/2;
            if(array[middle]>key)
            {
                max=(middle-1);
            }
            if(array[middle]==key)
            {
              System.out.println(key+" found at position "+(middle+1));
              break;
            }
            if(array[middle]<key)
            {
                min=(middle+1);
            }
        }
    }
}
