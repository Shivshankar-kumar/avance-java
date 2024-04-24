
package Generic_In_Java;
import java.util.*;
public class gen1 {
    public static void main(String[] args) {
        //Without generics<>
        // ArrayList al=new ArrayList();
        // al.add("Shivshankar Kuamar");
        // al.add("Shivam");
        // al.add("kajal");
        // al.add("Riya");
        // al.add(100);
        // al.add(45.2f);
        // System.out.println(al);
        //Storing the data 
        // Object el=al.get(0);//downcasting
        // int ele=(Integer)al.get(4);//downcasting
        // float f=(Float)al.get(5);//downcasting
        // System.out.println(el);
        // System.out.println(f);

        //with Generic<>
        LinkedList<String> al=new LinkedList<>();
        al.add("Shivshankar Kuamar");
        al.add("Shivam");
        al.add("kajal");
        al.add("Riya");
        //al.add(100); it you'll give an error
        System.out.println(al);
    }
}
