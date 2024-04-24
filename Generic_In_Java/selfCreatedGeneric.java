package Generic_In_Java;
import java.util.*;

//create a class where type is userdefine
class Gen<S>{
    //self type reference OR user data type
    S name;
    //constructor
    public Gen(S name){
        this.name=name;
    }
    //Method
    public void display(){
        System.out.println("Class Name: "+name.getClass().getName());
    }
    //getter
    public S getName(){
        return name;
    }
}
public class selfCreatedGeneric{
    public static void main(String[] args) {
        //Created object of our class with userdefined generic
        Gen<String> g=new Gen<>("Shivshankar");
        g.display();
        System.out.println(g.getName());
        Gen<Integer> g1=new Gen<>(4500);
        g1.display();
        System.out.println(g1.getName());
        
    }
}