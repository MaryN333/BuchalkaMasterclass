package section6ControlFlow;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));    // true
        System.out.println(isPalindrome(707));      // true
        System.out.println(isPalindrome(11212));    // false
        System.out.println(isPalindrome(-1));        // true
    }
    // write code here
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        if (number < 10) {
            return true;
        }
        int reverse = 0;
        int num = number;

        while (true) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            if (num <= 9) {
                break;
            }
            num = num / 10;
        }
        return number == reverse;
    }
}
