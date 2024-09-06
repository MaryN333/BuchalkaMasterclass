package section6ControlFlow;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));     // true
        System.out.println(hasSameLastDigit(23,32,42));     // true
        System.out.println(hasSameLastDigit(9,99,999));     // false
    }
    // write code here
    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }
        return (number1 % 10 == number2 % 10) || (number1 % 10 == number3 % 10) || (number2 % 10 == number3 % 10);
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}
