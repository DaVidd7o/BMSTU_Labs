class Complex {
    private double real;
    private double imaginary;
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }
    public Complex(double real1, double imaginary1) {
        this.real = real1;
        this.imaginary = imaginary1;
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