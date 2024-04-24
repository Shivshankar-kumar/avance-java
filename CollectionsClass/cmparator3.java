package CollectionsClass;
import java.util.*;
//We can sort the complex data using camparator in three way
// 1. implements camparator interface
// 2. Inside Anonymous class
// 3. Using Lemda Expression ->
//we'll discuss three concept in this program
class Car{
    String model;
    int carNumber;
    String name;
    //constructor
    public Car(String model,int carNumber,String name){
        this.model=model;
        this.carNumber=carNumber;
        this.name=name;
    }
    public String getModel() {
        return model;
    }
    public int getCarNumber() {
        return carNumber;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return model+" "+carNumber+" "+name;
    }
}

// 1. Implements camparator interface
class myComparator implements Comparator<Car>{
    public int compare(Car x,Car y){
        if(x.carNumber>y.carNumber){
            return 1;
        }else{
            return -1;
        }
    }
}
public class cmparator3 {
    public static void main(String[] args) {
        Car c1=new Car("aulto800",89765,"Maruti Suzuki");
        Car c2=new Car("NanoBs4",90875,"tata");
        Car c3=new Car("Mahindras6",23890,"Mahindra");

        // 1. object
        myComparator mc=new myComparator();
        
        // 2.Anonymous class using here
        Comparator<Car> cm=new Comparator<>(){
            public int compare(Car a, Car b){
                if(a.carNumber>b.carNumber){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        // 3. With lemda Expression
        Comparator<Car> cp=(Car a,Car b)->{
                if(a.carNumber>b.carNumber){
                    return 1;
                }else{
                    return -1;
                }
            };
         ArrayList al=new ArrayList();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        // 1.
        Collections.sort(al,mc);
        System.out.println(al);
        // 2
        Collections.sort(al,cm);
        System.out.println(al);
        // 3.
        Collections.sort(al,cp);
        System.out.println(al);

        // Also valid but industry level implementation
        Collections.sort(al,(Car a,Car b)->{
            if(a.carNumber>b.carNumber){
                return 1;
            }else{
                return -1;
            }
        });
        System.out.println(al);

        // It is also Valid
        Collections.sort(al,new Comparator<Car>(){
            public int compare(Car a, Car b){
                if(a.carNumber>b.carNumber){
                    return 1;
                }else{
                    return -1;
                }
    }});
    System.out.println(al);
    }
}
