package recursion;

public class Factorial {
    public static void main(String[] args) {
        int number = 6;
        int result = findFactorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    static int findFactorial(int number) {
        if(number==0)
        {
            return 1;
        }
        return number * findFactorial(number - 1);
    }

}