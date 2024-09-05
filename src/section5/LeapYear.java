package section5;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));     //false
        System.out.println(isLeapYear(1600));      //true
        System.out.println(isLeapYear(2017));      //false
        System.out.println(isLeapYear(2000));      //true
    }
    // write code here
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
