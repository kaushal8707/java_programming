package programs;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        int number=476348;
        int reverse=0,reminder=0;
        while(number!=0)
        {
           reminder=number%10;
           reverse=reverse*10+reminder;
           number=number/10;
        }
        System.out.println(number+"   Reverse Number is : "+reverse);
    }
}
