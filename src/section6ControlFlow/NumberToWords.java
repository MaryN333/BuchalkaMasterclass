package section6ControlFlow;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));       // 1
        System.out.println(getDigitCount(123));     // 3
        System.out.println(getDigitCount(-12));     // -1
        System.out.println(getDigitCount(5200));    // 4

        System.out.println(reverse(-121));          // -121
        System.out.println(reverse(1212));          // 2121
        System.out.println(reverse(1234));          // 4321
        System.out.println(reverse(100));           // 1

        numberToWords(123);             // One Two Three
        numberToWords(1010);            // One Zero One Zero
        numberToWords(1000);
        numberToWords(-12);             // Invalid Value
    }
    // write code here
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversed = reverse(number);
            int reversedLength = Integer.toString(reversed).length();

            for (int i = 1; i <= reversedLength; i++) {
                int last = reversed % 10;
                switch (last) {
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    default -> System.out.println("Nine");
                }
                reversed /= 10;
            }
            if (reversedLength != getDigitCount(number)) {
                for (int i = 0; i < getDigitCount(number) - reversedLength; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    public static int reverse(int number) {
        int length = (number < 0) ? Integer.toString(number).length() - 1 : Integer.toString(number).length();
        int reverse = 0;
        int lastNumber = 0;
        for (int i = 0; i < length; i++) {
            lastNumber = number % 10;
            reverse = (reverse + lastNumber) * 10;
            number = number / 10;
        }
        return reverse / 10;
    }

    public static int getDigitCount(int number) {
        return (number < 0) ? -1 : Integer.toString(number).length();
    }
}
