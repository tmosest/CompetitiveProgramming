package com.tmosest.numberwang.complex;

public class ComplexNumber {
    
    public double real;
    public double imaginary;
    public double angle;

    // Normal form.
    public ComplexNumber(double real, double imgainary) {
        this.real = real;
        this.imaginary = imgainary;
        this.angle = Math.tanh(imgainary / real);
    }

    public double absolute() {
        return this.product();
    }

    public double productSqr() {
        return this.real * this.real + this.imaginary * this.imaginary;
    }

    public double product() {
        return Math.sqrt(this.productSqr());
    }

    public ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -1 * this.imaginary);
    }

    public ComplexNumber reciprocal() {
        return new ComplexNumber(real / productSqr(), -1 * imaginary / productSqr());
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber mult(ComplexNumber other) {
        return new ComplexNumber(this.real * other.real - this.imaginary * other.imaginary, this.real * other.imaginary + this.imaginary * other.real);
    }

    // TODO
    public ComplexNumber div(ComplexNumber other) {
        return new ComplexNumber(real, imaginary);
    }

    public String toStringStandard() {
        return String.format("%.1f + %.1fi", this.real, this.imaginary);
    }

    public String toStringPolar() {
        return String.format("%.1f (cos %.3f + i sin %.3f)", absolute(), angle, angle);
    }

    public String toExponentialForm() {
        return String.format("%.1f e ^ i(%.3f)", absolute(), angle);
    }

    public String toString() {
        return toStringStandard() + " = " + toStringPolar() + " = " + toExponentialForm();
    }

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(3, 2);
        ComplexNumber two = new ComplexNumber(4, -1);
        System.out.println(one.mult(two).toString());

        System.out.println(one.mult(one.conjugate()));
    }
}
