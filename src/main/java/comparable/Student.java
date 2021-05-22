package comparable;

public class Student implements Comparable<Student>
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

//    public int compareTo(Student o) {
//        if(this.id>o.id)
//            return 1;
//        else if(this.id==o.id)
//            return 0;
//        else if(this.id<o.id)
//            return -1;
//        return 0;
//    }

    public int compareTo(Student obj) {
       return this.name.compareTo(obj.name);
    }
}
