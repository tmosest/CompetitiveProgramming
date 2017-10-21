package com.tmosest.CompetitiveProgramming.hackerrank;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * Utility Function to help with Testing.
 * 
 * @author tmosest (Tyler Moses)
 *
 */
public class HackerrankUtil {

  static BufferedReader out = null;

  static InputStream testInput;

  static String data;
  
  /**
   * Sets the data for the System.in for Scanner tests.
   * @param data
   * @throws UnsupportedEncodingException
   */
  public static void setSystemIn(String data) throws UnsupportedEncodingException {
    testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
    System.setIn(testInput);
  }
  
}
