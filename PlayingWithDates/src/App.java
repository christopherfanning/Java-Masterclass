import java.util.*;

public class App {

    static CalendarDay[] dates = new CalendarDay[20];

    public static void main(String[] args) {

        System.out.println("Hi!");
        generateDays();
//        CalendarDay[] dates;

    }

    public static void generateDays(){
        System.out.println("GenerateDays is being called.");

        int furlough = 1;
        int date = 1;
        int month = 0;
        int year = 2021;
        int day = 1;

        for ( int i = 0 ; i < 10 ; i++){

           CalendarDay dateRunner = new CalendarDay(month, year, furlough, day);
           day++;

           dates[i] = dateRunner;
        }

//        dates.toString();
        System.out.println("Lets print out all the calendar data objects.");
//        System.out.println(Arrays.toString(dates));
        for (int i = 0 ; i < dates.length; i++) {
           CalendarDay thisOne = dates[i];
            System.out.println(thisOne.day);
            System.out.println(thisOne.year);
        }
    }
}
