package section6ControlFlow;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));   // 5
        System.out.println(getGreatestCommonDivisor(12, 30));   // 6
        System.out.println(getGreatestCommonDivisor(9, 18));    // -1
        System.out.println(getGreatestCommonDivisor(81, 153));  // 9
    }
    // write code here
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisor = 1;
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }
        for (int i = 2; i <= first; i++) {
            if (first % i == 0 && second % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }
}
