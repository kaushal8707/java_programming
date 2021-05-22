package cloning;
import java.util.HashMap;

public class DeepCopying implements Cloneable
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        HashMap<Integer,String> hMap=new HashMap<Integer, String>();
        hMap.put(345,"abc");
        hMap.put(897,"vgh");
        hMap.put(147,"njl");
        int marks[]={3,7,1,9};
        Bachelor bachelor=new Bachelor("kaushal",hMap,864579L,marks);
        Bachelor copyBachelor=bachelor.clone();
        System.out.println(bachelor+" - - - "+copyBachelor);
        System.out.println(bachelor.hashmap==copyBachelor.hashmap);
        System.out.println(bachelor.name==copyBachelor.name);
        System.out.println(bachelor.salary==copyBachelor.salary);
        System.out.println(bachelor.marks==copyBachelor.marks);



    }


}
