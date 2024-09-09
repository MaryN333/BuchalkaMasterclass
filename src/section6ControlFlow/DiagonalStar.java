package section6ControlFlow;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(4);
        printSquareStar(5);
        printSquareStar(10);
    }
    // write code here
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();

            for (int i = 2; i <= number - 1; i++) {
                System.out.print("*");
                for (int j = 2; j < number; j++) {
                    System.out.print((i == j || j == number - i + 1) ? "*" : " ");
                }
                System.out.println("*");
            }
            for (int i = 1; i <= number; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
