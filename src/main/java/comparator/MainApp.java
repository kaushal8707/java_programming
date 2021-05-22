package comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp
{
    public static void main(String[] args)
    {
        List<Student> list=
                Arrays.asList(new Student("kaushal",345,8976L),
                new Student("bharat",112,1233L),
                new Student("raghu",889,7654L),
                new Student("kanishk",667,33443L));
        Collections.sort(list,new SortOnId());
        list.forEach(System.out::println);


    }
}
