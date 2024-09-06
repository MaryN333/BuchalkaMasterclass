package section6ControlFlow;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));                      // false
        System.out.println(isLeapYear(1600));                       // true
        System.out.println(isLeapYear(2017));                       // false
        System.out.println(isLeapYear(2000));                       // true

        System.out.println(getDaysInMonth(1, 2020));    // 31
        System.out.println(getDaysInMonth(2, 2020));    // 29
        System.out.println(getDaysInMonth(2, 2018));    // 28
        System.out.println(getDaysInMonth(-1, 2020));   // -1
        System.out.println(getDaysInMonth(1, -2020));   // -1
    }
    // write code here
    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        result = true;
                    }
                } else {
                    result = true;
                }
            }
        }
        return result;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month > 12 || month < 1) || (year > 9999 || year < 1)) {
            return -1;
        } else {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                default -> isLeapYear(year)? 29:28;
            };
        }
    }
}
