package section7_inheritance;

public class SimpleCalculator {
    // write code here
    private double firstNumber;
    private double secondNumber;

    // * * * * * GETTERS AND SETTERS * * * * * *
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    // * - * - * - * - * - *

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber-secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        return secondNumber == 0 ? 0 : firstNumber / secondNumber;
    }


    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}

