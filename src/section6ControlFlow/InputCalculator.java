package section6ControlFlow;

import java.util.Scanner;
public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    // write code here
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int summ = 0;
        int count = 0;
        System.out.println("Enter integer numbers by pressing Enter. Press any letter to exit.");
        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                summ += number;
                count++;
            } catch (NumberFormatException e) {
                long AVG = Math.round((double) summ / count);
                System.out.println("SUM = " + summ + " AVG = " + AVG);
                break;
            }
        }
    }
}
