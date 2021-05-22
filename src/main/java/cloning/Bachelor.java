package cloning;
import java.util.*;

public class Bachelor
{
     String name;
     Map <Integer,String> hashmap;
     Long salary;
     int marks[];


    public Bachelor(String n, HashMap<Integer, String> h, Long s, int[] m) {
        this.name = n;
        this.hashmap = h;
        this.salary = s;
        this.marks = m;
    }



    public Bachelor clone() throws CloneNotSupportedException
    {
        HashMap<Integer,String> hMap=new HashMap();
        Set<Integer> key=hashmap.keySet();
        Iterator<Integer> keySet=key.iterator();
        while(keySet.hasNext())
        {
            Integer k=keySet.next();
            hMap.put(k,hashmap.get(k));
        }
        int mrk[]=new int[marks.length];
        for(int i=0;i<marks.length;i++)
        {
            mrk[i]=marks[i];
        }
        return new Bachelor(new String(name),hMap, new Long(salary), mrk);
    }
    @Override
    public String toString() {
        return "Bachelor{" +
                "name='" + name + '\'' +
                ", hashmap=" + hashmap +
                ", salary=" + salary +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
