package section6ControlFlow;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));     // 2500
        System.out.println(sumOdd(-1, 1000));   // -1
        System.out.println(sumOdd(100, 100));   // 0
        System.out.println(sumOdd(13, 13));     // 13
        System.out.println(sumOdd(100, -100));  // -1
        System.out.println(sumOdd(100, 1000));  // 247500
    }
    // write code here
    public static boolean isOdd(int number) {
        return number < 0 ? false : number % 2 == 0 ? false : true;
    }

    public static int sumOdd(int start, int end) {
        int summa = 0;
        if (end < start || start < 1 || end < 1) {
            return -1;
        }
        if (isOdd(start)) {
            for (int i = start; i <= end; i += 2) {
                summa += i;
            }
        } else {
            for (int i = start + 1; i <= end; i += 2) {
                summa += i;
            }
        }
        return summa;
    }
}
