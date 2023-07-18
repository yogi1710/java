import java.time.LocalDate;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        //To get the today date     
        LocalDate today = LocalDate.now();
        String day = today.getDayOfWeek().toString();
        System.out.println(day);

        // To get the Specified date
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = sc.nextInt();

        LocalDate someday = LocalDate.of(year, month, date);
        String day1 = someday.getDayOfWeek().toString().toUpperCase();
        System.out.println(day1);
    }
}
