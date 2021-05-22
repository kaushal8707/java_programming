package comparator;
import java.util.Comparator;
import java.util.Map;

public class SortOnKey implements Comparator<Map.Entry<Student,Integer>>
{
    @Override
    public int compare(Map.Entry<Student,Integer> entry1, Map.Entry<Student,Integer> entry2)
    {
        return entry1.getKey().name.compareTo(entry2.getKey().name);
    }
}
