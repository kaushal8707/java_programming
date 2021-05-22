package cloning;

public class Student implements Cloneable
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
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
