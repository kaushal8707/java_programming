package programs;

public class ReverseString
{
    public static void main(String[] args) {
        String str="madam";
        char array[]=str.toCharArray();
        int str_length=str.length();
        for(int i=0,j=str.length()-1;i<str_length/2;i++,j--)
        {
                char temp=array[i];
                array[i]=array[j];
                array[j]=temp;
        }
       String reverse=new String(array);
        if(str.equals(reverse))
        {
            System.out.println("palindrome");
        }
    }
}
