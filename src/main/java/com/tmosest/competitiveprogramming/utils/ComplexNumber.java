package com.tmosest.competitiveprogramming.utils;

import java.security.InvalidParameterException;

/**
 * Utility class for Complex Numbers.
 */
public class ComplexNumber {
  // Used to carry a value.
  int realValue;
  // Used to carry an i value.
  int imaginaryValue;

  /**
   * Create a new complex number (0 + 0i).
   */
  public ComplexNumber() {
    realValue = 0;
    imaginaryValue = 0;
  }

  /**
   * Create a new complex number. (realValue + imaginaryValue * i).
   * @param realValue The value of the real part.
   * @param imaginaryValue The value of the imaginaryValue part.
   */
  public ComplexNumber(int realValue, int imaginaryValue) {
    this.realValue = realValue;
    this.imaginaryValue = imaginaryValue;
  }

  /**
   * Create a complex number from the string (a+bi).
   * @param string The string to create the complex number from.
   */
  public ComplexNumber(String string) {
    String[] vales = string.split("\\+");
    if (vales.length != 2) {
      throw new InvalidParameterException("Must be a plus sign.");
    }
    realValue = Integer.valueOf(vales[0]);
    imaginaryValue = Integer.valueOf(vales[1].replace("i", ""));
  }

  /**
   * Get the real part.
   * @return The real value.
   */
  public int getRealValue() {
    return this.realValue;
  }

  /**
   * Get the imaginary part.
   * @return The imaginary value.
   */
  public int getImaginaryValue() {
    return imaginaryValue;
  }


  /**
   * Add two complex numbers.
   * @param other The other complex number we are adding to.
   * @return The sum of the two complex numbers.
   */
  public ComplexNumber add(ComplexNumber other) {
    return new ComplexNumber(realValue + other.realValue, imaginaryValue + other.imaginaryValue);
  }

  /**
   * Multiply this complex number times another.
   * It foils the parameters.
   * @param other The other number.
   * @return The multiple.
   */
  public ComplexNumber multiply(ComplexNumber other) {
    int one = realValue * other.realValue - imaginaryValue * other.imaginaryValue;
    int two = imaginaryValue * other.realValue + other.imaginaryValue * realValue;
    return new ComplexNumber(one, two);
  }

  /**
   * Converts the object to a string for printing.
   * @return A string of the form: "a+bi"
   */
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(realValue);
    stringBuilder.append("+");
    stringBuilder.append(imaginaryValue);
    stringBuilder.append("i");
    return stringBuilder.toString();
  }
}
