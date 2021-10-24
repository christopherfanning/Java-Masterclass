public class CalendarDay {

//    static String dayOfWeek;
//    static char daleyDay;
//    static int month;
//    static int year;
//    static int furlough;
//    static int day;

    int year;
    int day;
    int furlough;
    int month;

    CalendarDay(int month, int year, int furlough, int day){

//        month = this.month;
//        year = this.year;
//        furlough = this.furlough;
//        day = this.day;

        this.month = month;
        this.year = year;
        this.furlough = furlough;
        this.day = day;

        System.out.println("I'm the constructor for calendarDays.");
    }

}
