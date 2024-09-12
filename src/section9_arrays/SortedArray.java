package section9_arrays;

import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int len) {
        int[] inputArray = new int[len];
        Scanner scanner = new Scanner((System.in));
        for (int i = 0; i < len; i++) {
            int number = scanner.nextInt();
            inputArray[i]=number;
        }
        return inputArray;
    }

    public static int[] sortIntegers(int[] array) {
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
    public static void printArray(int[]array){
        for(int i =0; i<array.length; i++){
            System.out.printf("Element %d contents %d%n", i,array[i]);
        }
    }

    public static void main(String[] args) {
        int[] inputArray = getIntegers(4);
        int[] sortedArray = sortIntegers(inputArray);
        printArray(sortedArray);
    }
}

