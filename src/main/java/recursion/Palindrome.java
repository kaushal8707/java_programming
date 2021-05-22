package recursion;

public class Palindrome
{
    public static void main(String[] args)
    {
            boolean status=checkPalindrome("madam")?true:false;
            if(status)
            {
                System.out.println(" palaindrome ");
            }
    }
    static boolean checkPalindrome(String str)
    {
        if(str.length()==0)
        {
            return true;
        }
        if(str.length()==1)
        {
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1))
        return checkPalindrome(str.substring(1,str.length()-1));

        return false;
    }
}
