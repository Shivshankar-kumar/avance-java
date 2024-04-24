package Map;
import java.util.TreeMap.*;
import java.util.Map;
import java.util.*;
class Employee{
    private String name;
    private int id;
    //constructor
    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    //override tostring method
    public String toString(){
        return id + " "+name;
    }
    @Override
    //override of finalize method which is present in the object class 
    public void  finalize(){
        System.out.println("Kais hain Aaplog!");
        System.out.println("Hastable is reffered null");
    }
}
public class hTable {
    public static void main(String[] args) {
        //Creating a class of object
        Employee emp=new Employee(21,"Ramakant");
        Hashtable<Integer,Object> ht=new Hashtable<>();
        ht.put(1,emp);
        System.out.println(emp);
        emp=null;
        System.out.println(emp);
        // ht.put(5,"India");
        // ht.put(4,"Jermuny");
        // ht.put(9,"ShreeLanka");
        // ht.put(10,"Gaya");
        System.out.println(ht);
        ht=null;
        System.out.println(ht);
        System.gc();
        System.out.println(ht);
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("Diesel",50);
        tm.put("Petrol",122);
        tm.put("Anda",90);
        System.out.println(tm);
        tm.putIfAbsent("CNG",120);
        System.out.println(tm);
        Set itr=tm.entrySet();
        Iterator it=itr.iterator();
        System.out.println(it.hasNext());
        // if(it.hasNext()){
        //     System.out.println(it.next());
        // }
        System.out.println(it);
    }
}
