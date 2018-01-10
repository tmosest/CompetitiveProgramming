package com.tmosest.competitiveprogramming.hackerrank.recursion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ArithmeticExpressions {

  public static boolean debugMode = false;

  private static class Equation {
    String ops;
    long result;

    public Equation(long result, String ops) {
      this.result = result;
      this.ops = ops;
    }
  }

  private static String convertEquation(Equation equation, int[] numbers) {
    StringBuilder sb = new StringBuilder();
    int charIndex = 0;
    for (int num : numbers) {
      sb.append(num);
      if (charIndex < equation.ops.length()) {
        sb.append(equation.ops.charAt(charIndex));
      } else if(equation.ops.length() != numbers.length - 1 && charIndex < numbers.length - 1) {
        sb.append("*");
      }
      charIndex++;
    }
    return sb.toString();
  }

  private static String findModEleven(int[] numbers) {
    Queue<Equation> equations = new LinkedList<Equation>();
    int index = 0;
    Equation equation = new Equation(numbers[index++], "");
    equations.add(equation);
    while(index < numbers.length) {
      int count = equations.size();
      for(int i = 0; i < count; i++) {
        equation = equations.poll();
        long result = equation.result;
        String ops = equation.ops;
        if (debugMode) {
          System.out.println("ops: " + ops);
        }
        Equation sub = new Equation((result - numbers[index]) % 101, ops + "-");
        equations.add(sub);
        Equation add = new Equation((result + numbers[index]) % 101, ops + "+");
        equations.add(add);
        Equation mult = new Equation((result * numbers[index]) % 101, ops + "*");
        equations.add(mult);
        if(add.result % 101 == 0) {
          return convertEquation(add, numbers);
        }
        if(mult.result % 101 == 0) {
          return convertEquation(mult, numbers);
        }
        if(sub.result % 101 == 0) {
          return convertEquation(sub, numbers);
        }
      }
      index++;
    }
    String result = "";
    while(!equations.isEmpty()) {
      equation = equations.poll();
      if(equation.result % 101 == 0) {
        result = convertEquation(equation, numbers);
        break;
      }
    }
    return result;
  }

  public static String solve() {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] numbers = new int[size];
    for (int i = 0; i < size; i++) {
      numbers[i] = in.nextInt();
    }
    in.close();
    return findModEleven(numbers);
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

}
