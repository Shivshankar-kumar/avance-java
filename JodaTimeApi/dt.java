package JodaTimeApi;
import java.time.*;
public class dt {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year=date.getYear();
        System.out.println(day+"-"+month+"-"+year);
        System.out.println(month);
        System.out.println(date.getMonthValue());
        LocalTime time=LocalTime.now();
        System.out.println(time);
        int hour=time.getHour();
        int minutes=time.getMinute();
        int second=time.getSecond();
        System.out.println(hour+":"+minutes+":"+second+":"+time.getNano());
    }
}
