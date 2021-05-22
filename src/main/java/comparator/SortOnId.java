package comparator;
import java.util.Comparator;

public class SortOnId implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return s1.id.compareTo(s2.id);
    }
}
