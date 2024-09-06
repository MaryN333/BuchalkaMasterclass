package section6ControlFlow;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime (21));       // 7
        System.out.println(getLargestPrime (217));      // 31
        System.out.println(getLargestPrime (0));        // -1
        System.out.println(getLargestPrime (45));       // 5
        System.out.println(getLargestPrime (-1));       // -1

    }
    // write code here
    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }
        for (int i = 2; i <number; i++) {
            if (number % i == 0) {
                number = number / i;
                i--;
            }
        }
        return number;
    }
}
