package section5;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));         // true
        System.out.println(hasTeen(23, 15, 42));        // true
        System.out.println(hasTeen(22, 23, 34));        // false
        System.out.println(isTeen(9));              // false
        System.out.println(isTeen(13));              // true
    }
    // write code here
    public static boolean hasTeen(int number1, int number2, int number3) {
        if (number1 >= 13 && number1 <= 19 || number2 >= 13 && number2 <= 19 || number3 >= 13 && number3 <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
//        if (num >= 13 && num <= 19){
//            return true;
//        }
//        return false;
    }
}
