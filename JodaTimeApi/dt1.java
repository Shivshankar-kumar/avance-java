package JodaTimeApi;
public class dt1 {
    public static void main(String[] args) {
        java.util.Date date=new java.util.Date();
        System.out.println(date);
        System.out.println(date.getMinutes());
        System.out.println(date.getClass());
        System.out.println(date.clone());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getTime());
        java.time.LocalDateTime tm=java.time.LocalDateTime.now();
        System.out.println(tm);  
        java.sql.Date d=new java.sql.Date(0); 
        System.out.println(d);
    }
}
