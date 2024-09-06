package section6ControlFlow;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));      // 4
        System.out.println(sumFirstAndLastDigit(257));      // 9
        System.out.println(sumFirstAndLastDigit(0));        // 0
        System.out.println(sumFirstAndLastDigit(5));        // 10
        System.out.println(sumFirstAndLastDigit(-10));      //-1
        System.out.println(sumFirstAndLastDigit(10));       // 1
    }
    // write code here
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return number * 2;
        }
        int last = number % 10;

        while (true) {
            number = number / 10;

            if (number < 10) {
                return number + last;
            }
        }
    }
}
