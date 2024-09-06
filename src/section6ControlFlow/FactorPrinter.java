package section6ControlFlow;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);        // 1 2 3 6
        printFactors(32);       // 1 2 4 8 16 32
        printFactors(10);       //1 2 5 10
        printFactors(-1);       // Invalid Value
    }
    // write code here
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println("1");
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
