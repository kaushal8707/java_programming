package comparator;
import java.util.*;
import java.util.stream.Collectors;

public class MainApp2
{
    public static void main(String[] args)
    {
        Map<Student,Integer> map=new HashMap<Student,Integer>();
        map.put(new Student("kaushal",345,8976L),23);
        map.put(new Student("bharat",112,1233L),11);
        map.put(new Student("raghu",889,7654L),871);
        map.put(new Student("kanishk",667,33443L),99);
        Set<Map.Entry<Student,Integer>> set=map.entrySet();
        List<Map.Entry<Student,Integer>> list=new ArrayList<>(set);
        Collections.sort(list,new SortOnKey());
        List<Map.Entry<Student,Integer>> listOfResult=map.entrySet().stream().collect(Collectors.toList());
        listOfResult.forEach(System.out::println);
    }
}
