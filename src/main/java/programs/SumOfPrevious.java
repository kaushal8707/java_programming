package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfPrevious
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter Number");
        int sum=0,total=0;
        Integer number=Integer.parseInt(reader.readLine());
        for(int i=0;i<=number;i++)
        {
            sum=sum+i;
            total=total+sum;
        }
        System.out.println(total);

    }
}
