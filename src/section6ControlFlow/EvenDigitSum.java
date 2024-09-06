package section6ControlFlow;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); // 20
        System.out.println(getEvenDigitSum(252));       // 4
        System.out.println(getEvenDigitSum(-22));       // -1
        System.out.println(getEvenDigitSum(2));         // 2
    }
    // write code here
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;

        while (true) {
            int last = number % 10;
            if (last % 2 == 0) {
                count += last;
            }
            number /= 10;
            if (number < 1) {
                return count;
            }
        }
    }
}
