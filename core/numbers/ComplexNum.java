package core.numbers;

public class ComplexNum {
    private double real;
    private double imaginary;

    public ComplexNum(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }


    public String toString() {
        return "Complex number: { " + real + " , " + imaginary + "j }";
    }
}
