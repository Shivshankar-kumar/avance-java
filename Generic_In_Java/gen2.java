package Generic_In_Java;
import java.util.*;
class Student1{
    private String name;
    private int age;
    Student1(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name +" "+age;
    }
}
    class Employee{
        public Employee(){
        super();
    }
    @Override
    public String toString(){
        return "HelloDear";
    }
}
public class gen2 {
    public static void main(String[] args) {
        Student1 std=new Student1("Shivshankar",19);
        Employee emp=new Employee();
        HashMap<String,Student1> hm=new HashMap<>();
        hm.put("India",std);
        System.out.println(hm);
        List<Employee> al=new ArrayList<>();
        Object o=(boolean)al.add(emp);
        //al.add(std);//It will give an error
        System.out.println(o);    
    }
}
