package programs;

public class FindMissingNumber
{
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,7,8,9,10};
        int sum0f10Number=10*(10+1)/2;
        int sumOfArrarElements=0;
        for(int i=0;i<array.length;i++)
        {
            sumOfArrarElements=sumOfArrarElements+array[i];
        }
        int missingNumber=sum0f10Number-sumOfArrarElements;
        System.out.println(missingNumber);

    }
}
