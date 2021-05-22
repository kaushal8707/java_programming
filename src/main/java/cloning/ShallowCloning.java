package cloning;

public class ShallowCloning implements Cloneable
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
      Student student=new Student("kaushal",112,685395634L);
      Student copy_obj=(Student)student.clone();
      System.out.println(student+" - - - "+copy_obj);
      System.out.println(student.id==copy_obj.id);
      System.out.println(student.name==copy_obj.name);
      System.out.println(student.salary==copy_obj.salary);

    }


}
