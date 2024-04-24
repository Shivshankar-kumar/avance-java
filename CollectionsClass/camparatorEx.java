package CollectionsClass;
import java.util.*;
class Student{
    String name;
    int age,marks;
    //constructor
    public Student(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getMarks() {
        return marks;
    }
    //Override toString method which is Super class method
    @Override
    public String toString(){
        return name+" "+age+" "+marks;
    }
}
//first way to implements the  camparator interface

class Alpha implements Comparator<Student>{
        @Override
        public int compare(Student a,Student b){
        if(a.age>b.age){
            return 1;
        }else{
            return -1;
        }
    }
};
public class camparatorEx{
    public static void main(String[] args) {
       Student st1=new Student("Shivshankar", 18, 78);
       Student st2=new Student("Kajal", 21, 67);
       Student st3=new Student("Juhi", 16, 90); 
        //2nd Way to create a class
       //Anonymouse class //Lemda Expression
       Comparator<Student> cm=(Student a,Student b)->
       {
            if(a.age>b.age){
                return 1;
            }else{
                return -1;
            }
       };
    //Alpha al=new Alpha();
       List<Student> list=new ArrayList<>();

       list.add(st1);
       list.add(st2);
       list.add(st3);
       Collections.sort(list,cm);
       System.out.println(list);
    }
}