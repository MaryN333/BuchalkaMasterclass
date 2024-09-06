package section5;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);      // 525600 min = 1 y and 0 d
        printYearsAndDays(1051200);     // 1051200 min = 2 y and 0 d
        printYearsAndDays(561600);      // 561600 min = 1 y and 25 d
        printYearsAndDays(0);           // 0 min = 0 y and 0 d
        printYearsAndDays(-5);          // Invalid Value
    }

    // write code here
    public static void printYearsAndDays(long minutes) {
        if (minutes >=0) {
            long years = minutes / 525600;
            long days = (minutes % 525600)/1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
