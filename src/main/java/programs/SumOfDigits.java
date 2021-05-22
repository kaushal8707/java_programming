package programs;

public class SumOfDigits
{
    public static void main(String[] args)
    {
        int number=476348;
        int reverse=0, reminder=0;
        int sumOfDigit=0;
        while(number!=0)
        {
            reminder=number%10;
            sumOfDigit=sumOfDigit+reminder;
            number=number/10;
        }
        System.out.println("Sum of Digits : "+sumOfDigit);
    }
}
