public class Main {
    public static void main(String[] args) {
        int n = 3;
        Complex[] vector1 = new Complex[n];
        Complex[] vector2 = new Complex[n];
        for (int i = 0; i < n; i++) {
            vector1[i] = new Complex(i,i+1);
            vector2[i] = new Complex(i + 1, i);
        }
        Complex[] result = new Complex[n];
        for (int i = 0; i < n; i++) {
            result[i] = vector1[i].add(vector2[i]);
        }
        System.out.println("Vector 1: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vector1[i].toString());
        }
        System.out.println("Vector 2: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vector2[i].toString());
        }
        System.out.println("Result: ");
        for (int i = 0; i < n; i++) {
            System.out.println(result[i].toString());
        }
    }
}
class Complex {
    private double real;
    private double imaginary;
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }
    public Complex(double real1, double imaginary1) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }
    public Complex multiply(Complex other) {
        return new Complex(this.real * other.real - this.imaginary * other.imaginary,
                this.real * other.imaginary + this.imaginary * other.real);
    }
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        return new Complex((this.real * other.real + this.imaginary * other.imaginary) / denominator,
                (this.imaginary * other.real - this.real * other.imaginary) / denominator);
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public double getReal() {
        return this.real;
    }
    public double getImaginary() {
        return this.imaginary;
    }
    public String toString() {
        if (this.imaginary < 0) {
            return this.real + " - " + Math.abs(this.imaginary) + "i";
        } else {
            return this.real + " + " + this.imaginary + "i";
        }
    }
}