package CollectionsClass;
import java.util.*;
//wap in java to sort a complex object on the bases of choice, so in that case we'll use camparator and comparable 
class Employee implements Comparable<Employee>{
    private String name;
    private int age,salery;
    //Constructor
    public Employee(String name,int age,int salery){
        this.name=name;
        this.age=age;
        this.salery=salery;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalery() {
        return salery;
    }

    @Override
    public int compareTo(Employee emp){
        if(this.age>emp.age){
            return 1;
        }else{
            return -1;
        }
    }
@Override
public String toString(){
return name+" "+age+" "+salery;
}
}
public class camparableEx {
    public static void main(String[] args) {
        Employee em1=new Employee("Badrinath", 34, 23455);
        Employee em2=new Employee("KesavMurya", 35, 45900);
        Employee em3=new Employee("Chandani", 19, 22335);

        ArrayList<Employee> aList=new ArrayList<>();
        aList.add(em1);
        aList.add(em2);
        aList.add(em3);
        Collections.sort(aList);
        System.out.println(aList);
    }
}
