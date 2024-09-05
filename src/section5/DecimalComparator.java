package section5;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));  // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));     // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));         // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));    // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0589, 3.0587));   // true
    }
    // write code here
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        double new1 = number1 * 1000;
        double new2 = number2 * 1000;
        int my1 = (int) new1;
        int my2 = (int) new2;

        return my1==my2;
    }
}
