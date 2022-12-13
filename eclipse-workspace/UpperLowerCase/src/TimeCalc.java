public class TimeCalc {
    public static void main(String[] args) {
        /* 1. Your program should create variables named hour, minute, and second and
           assign them values that are roughly the current time. Use a 24-hour clock, so
           that at 2pm the value of hour is 14. */
        int hour = 23;
        int minute = 50;
        int second = 59;

        /* 2. Have the program print the time, as given by the three variables. */
        System.out.println("The time is "+hour+":"+minute+":"+second);

        /* 3. Make the program calculate and print the number of seconds since midnight. */
        int SEC_PER_MINUTE = 60;
        int SEC_PER_HOUR = 60 * SEC_PER_MINUTE;
        int SEC_PER_DAY = 24 * SEC_PER_HOUR;
        int secondsElapsedSinceMidnight = hour*SEC_PER_HOUR + minute*SEC_PER_MINUTE + second;
        System.out.println("Seconds since midnight: " + secondsElapsedSinceMidnight);

        /* 4. Make the program calculate and print the number of seconds remaining in the
           day. */
        System.out.println(SEC_PER_DAY - secondsElapsedSinceMidnight + " seconds remain.");

        /* 5. Make the program calculate and print the percentage of the day that has
           passed. */
        System.out.println(secondsElapsedSinceMidnight * 100 / SEC_PER_DAY +
            "% of the day is over.");

        /* 6. Make sure the program works with various different values of hour, minute,
           and second. */
        // 9:44:18 -> 35058, 51342, 40%
        // 23:50:59 -> 85859, 541, 99%

        /* 7. Include your name, assignment number, and date in a comment at the top of
           the program. */

        /* 8. You may want to use additional variables to hold values temporarily during
           the computation. Variables like this, that are used in a computation but never
           printed, are sometimes called intermediate or temporary variables. */

    }
}
