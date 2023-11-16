public class DateDifference {

    public static int daysBetween(int[] date1, int[] date2){
        int[] Month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dt1 = date1[0], mn1 = date1[1], yr1 = date1[2];
        int dt2 = date2[0], mn2 = date2[1], yr2 = date2[2];

        int days = 0;

        for(int year = yr1; year < yr2; year++){
            if(isLeapYear(year))
                days += 366;
            else
                days += 365;
        }

        for(int month = 1; month < mn1 ; month++){
            days -= Month[month];
            if(month == 2 && isLeapYear(yr1)){
                days++;
            }
        }

        days -= dt1;

        for(int month = 1; month < mn2;month++){
            days += Month[month];
            if(month == 2 && isLeapYear(yr2)){
                days++;
            }
        }

        days += dt2;

        return days;
    }

    public static boolean isLeapYear(int year){
        return year % 4 == 0;
    }
    public static void main(String[] args) {
        int[] dt1 = {10, 2, 2014};
        int[] dt2 = {10, 3, 2015};
        System.out.println("Output: " + daysBetween(dt1, dt2));

        int[] dt3 = {10, 2, 2000};
        int[] dt4 = {10, 3, 2000};
        System.out.println("Output: " + daysBetween(dt3, dt4));

        int[] dt5 = {10, 2, 2000};
        int[] dt6 = {10, 2, 2000};
        System.out.println("Output: " + daysBetween(dt5, dt6));

        int[] dt7 = {1, 2, 2000};
        int[] dt8 = {1, 2, 2004};
        System.out.println("Output: " + daysBetween(dt7, dt8));
    }
}
