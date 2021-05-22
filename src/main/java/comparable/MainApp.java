package comparable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp
{
    public static void main(String[] args) {
        List<Student> list=Arrays.asList(new Student("kaushal",8890,6586345L),
                new Student("raju",78,564794L),
                new Student("prabhu",112,12345L),
                new Student("kanishk",56,78987L));
        Collections.sort(list);
        for(Student s:list)
        {
            System.out.println(s);
        }


    }
}
