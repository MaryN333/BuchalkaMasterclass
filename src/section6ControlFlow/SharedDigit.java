package section6ControlFlow;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    // write code here
    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99))
            return false;
        int number1last = number1 % 10;
        int number1first = number1 / 10;
        int number2last = number2 % 10;
        int number2first = number2 / 10;
        return ((number1first==number2first || number1first==number2last) || (number1last==number2first || number1last==number2last));
    }
}
