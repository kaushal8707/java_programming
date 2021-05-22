package programs;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesCharacters
{
    public static void main(String[] args) {
        String str="kaushal singh";
        Set<Character> set=new HashSet<Character>();
        char array[]=str.toCharArray();
        for(int i=0;i<array.length;i++)
        {
            boolean flag=false;
            for(int j=i+1;j<array.length;j++) {
                if (array[j] == array[i]) {
                    flag = true;
                    set.add(array[i]);
                    break;
                }
            }
            if(flag)
            {
                System.out.print(array[i]+" ");
            }
        }
    }
}
