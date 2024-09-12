package section9_arrays;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return Integer.parseInt(input.trim());
    }

    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersInt = new int[number];
        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            numbersInt[i] = Integer.parseInt(input.trim());
        }
        return numbersInt;
    }

    private static int findMin(int[] intArray) {
        int min = intArray[0];      //int min=Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length - 1; i++) {
            if (intArray[i + 1] < min) {
                min = intArray[i + 1];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int number = readInteger();
        int[] numbersInt = readElements(number);
        System.out.println(findMin(numbersInt));
    }
}