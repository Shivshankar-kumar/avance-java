package Map;
import java.util.WeakHashMap;
import java.util.HashMap;;
class city{
    private String name;
    private int area;
    public city(String name,int area){
        this.name=name;
        this.area=area;
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public void finalize(){
        System.out.println("WeakHashMap references has assign to null");
    }
}
public class weakHashMapExample {
    public static void main(String[] args) {
        city ct=new city("Meerut",20);
        HashMap<Integer,Object> wkmp =new HashMap<>();
        wkmp.put(101,ct);
        System.out.println(ct);
        ct=null;
        System.out.println(ct); 
        wkmp=null;
        System.out.println(wkmp);
        System.gc();
        System.out.println(wkmp);   
    }
}
