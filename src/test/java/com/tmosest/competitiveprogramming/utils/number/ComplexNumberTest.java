package com.tmosest.competitiveprogramming.utils.number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Complex Number test")
public class ComplexNumberTest {

  @Test
  @DisplayName("Default complex number is 0+0i")
  void default_should_be_0_0() {
    ComplexNumber complexNumber = new ComplexNumber();
    Assertions.assertEquals(complexNumber.getRealValue(), 0);
    Assertions.assertEquals(complexNumber.getImaginaryValue(), 0);
  }

  @Test
  @DisplayName("To String on default should be 0+0i")
  void default_to_string() {
    ComplexNumber complexNumber = new ComplexNumber();
    Assertions.assertEquals("0+0i", complexNumber.toString());
  }

  @Test
  @DisplayName("Default times default should be default")
  void default_times_default() {
    ComplexNumber complexNumber = new ComplexNumber().multiply(new ComplexNumber());
    Assertions.assertEquals(0, complexNumber.getRealValue());
    Assertions.assertEquals(0, complexNumber.getImaginaryValue());
  }

  @Test
  @DisplayName("Can create a complex numbers with values")
  void initial_value_constructor() {
    ComplexNumber complexNumber = new ComplexNumber(2, 1);
    Assertions.assertEquals(2, complexNumber.getRealValue());
    Assertions.assertEquals(1, complexNumber.getImaginaryValue());
  }

  @Test
  @DisplayName("To string works on initialized complex numbers")
  void to_string_on_initialized() {
    ComplexNumber complexNumber = new ComplexNumber(2, 1);
    Assertions.assertEquals("2+1i", complexNumber.toString());
  }

  @Test
  @DisplayName("To string works")
  void string_constructor_works() {
    String complexString = "2+-2i";
    ComplexNumber complexNumber = new ComplexNumber(complexString);
    Assertions.assertEquals(complexString, complexNumber.toString());
  }

  @Test
  @DisplayName("Should be able to add two complex numbers")
  void complex_addition_should_work() {
    ComplexNumber one = new ComplexNumber("2+-5i");
    ComplexNumber two = new ComplexNumber("1+2i");
    Assertions.assertEquals("3+-3i", one.add(two).toString());
  }
}
