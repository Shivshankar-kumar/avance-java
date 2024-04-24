package Map;
import java.util.*;
class Student{
private String name;
private int age;
private int id;
public Student(String name,int age,int id){
    this.name=name;
    this.age=age;
    this.id=id;
}
public String getName() {
    return name;
}
public int getAge() {
    return age;
}
public int getId() {
    return id;
}
public String toString(){
    return name +" "+age +" "+id;
}
}
public class MapExample{
    public static void main(String[] args) {
        Student std1=new Student("Shivshankar",20,12345);
        Student std2=new Student("Kajal",19,2469);
        Student std3 =new Student("Pavan Kumar",18,9876);
        System.out.println("Name: "+std1.getName());
        System.out.println("Age: "+std1.getAge());
        System.out.println("Id: "+std1.getId());
        Map m=new HashMap();
        m.put(1,std1);
        m.put(2,std2);
        m.put(3,std3);
        System.out.println(m);
        //Accessing The all key,and Value from map
        Set set=m.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}