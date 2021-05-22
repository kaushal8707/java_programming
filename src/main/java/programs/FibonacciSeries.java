package programs;

public class FibonacciSeries
{
    public static void main(String[] args) {

        int a=0;
        int b=1;
        int count=3;
        System.out.print(a+" "+b+" ");
        while(count<11)
        {
            int c=(a+b);
            System.out.print(c+" ");
            a=b;
            b=c;
            count++;
        }
    }
}
