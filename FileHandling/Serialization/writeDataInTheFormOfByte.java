package Serialization;

/*WAp in java to Store all information in file 
in the form of ByteStream Using the 
Concept of Serialization. */

// import java.io.Serializable;
// import java.io.ObjectOutputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
class Student implements java.io.Serializable{ 
    String name,dept;
    int enroll,year;
    //constructor
    public Student(String name, String dept, int enroll, int year){
        this.name=name;
        this.dept=dept;
        this.enroll=enroll;
        this.year=year;
    }
}
public class writeDataInTheFormOfByte {
    public static void main(String[] args) {
        //object of Student Class
        Student std1=new Student("Shivshankar Kumar", "BCA", 50859, 2021);
        try{
        //Object of FileOutputStream Class
        java.io.ObjectOutputStream oos=new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileHandling/user.txt",false));

        oos.writeObject(std1);
        oos.flush();
        oos.close();
        System.out.println("Success!");
    }catch(java.io.IOException e){
        System.out.println(e);
    }

    //Read the Data from File[Destructing the data is called Deserialization]
    try{
    java.io.ObjectInputStream fis=new java.io.ObjectInputStream(new java.io.FileInputStream("fileHandling/user.txt"));
    Student s=(Student)fis.readObject();
    System.out.println("Name: "+s.name+"\n"+"Dept: "+s.dept+"\n"+"Enrollment: "+s.enroll+"\n"+"Year: "+s.year);
    fis.close();
    }catch(java.io.IOException e){
        System.out.println(e);
    }
    catch(ClassNotFoundException c){
        System.out.println(c);
    }
}
}
