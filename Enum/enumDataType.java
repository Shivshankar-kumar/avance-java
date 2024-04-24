package Enum;
import java.util.*;
//Give an example of enum data type which stores the collection of Constant

enum Direction{
   EAST,WEST,NORTH,SOUTH; 
}
enum Result{
    FIRST,SECOND,FAIL,BACK;
    //Noraml variable
    int marks;
    //CONSTRUCTOR
    Result(){
        //It will Run four time because four Constant are declared inside Result enum data type.
        System.out.println("result Has Been Declared by the government portal of uttarpradesh");
    }
    //setter
    public void setMarks(int marks){
        this.marks=marks;
    }
    //getter
    public int getMarks(){
        return marks;
    }
}
public class enumDataType {
    public static void main(String[] args) {
       Direction e=Direction.EAST;
       System.out.println(e);
       System.out.println(Direction.WEST);
       System.out.println(Direction.NORTH);
       System.out.println(Direction.SOUTH);
       Result.FIRST.setMarks(89);
       System.out.println(Result.FIRST.getMarks());
    }
}
