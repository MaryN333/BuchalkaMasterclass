package section5;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));       // false
        System.out.println(hasEqualSum(1, 1, 2));       // true
        System.out.println(hasEqualSum(1, -1, 0));       // true


    }
    // write code here
    public static boolean hasEqualSum(int number1, int number2, int number3) {
        int result = number1 + number2;
        return result == number3;
//        if (result == number3) {
//            return true;
//        }
//        return false;
    }
}
