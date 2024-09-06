package section6ControlFlow;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));     // true
        System.out.println(isPerfectNumber(28));    // true
        System.out.println(isPerfectNumber(5));     // false
        System.out.println(isPerfectNumber(-1));    // false
    }
    // write code here
    public static boolean isPerfectNumber(int number){
        if (number < 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }
}
