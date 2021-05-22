package comparator;

public class Student
{
     String name;
     Integer id;
     Long salary;

    public Student(String name, Integer id, Long salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
