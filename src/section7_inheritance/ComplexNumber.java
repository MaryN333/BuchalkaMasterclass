package section7_inheritance;

public class ComplexNumber {
    // write code here
    private double real;
    private double imaginary;

    // CONSTRUCTOR
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // GETTERS
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // METHODS
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber complexNumber){
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());                       // one.real= 2.0
        System.out.println("one.imaginary= " + one.getImaginary());             // one.imaginary= 2.0
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());                       // one.real= -0.5
        System.out.println("one.imaginary= " + one.getImaginary());             // one.imaginary= 3.5
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());                 // number.real= 3.0
        System.out.println("number.imaginary= " + number.getImaginary());       // number.imaginary= -5.0
    }
}
