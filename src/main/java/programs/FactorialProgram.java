package programs;
public class FactorialProgram
{
    public static void main(String[] args)
    {
        int number=4;
        int fact=1;
        while(number!=0)
        {
            fact=fact*number;
            number--;
        }
        System.out.println("Factorial = "+fact);
    }

}
