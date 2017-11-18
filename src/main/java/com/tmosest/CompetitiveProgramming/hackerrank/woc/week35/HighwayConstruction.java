package com.tmosest.CompetitiveProgramming.hackerrank.woc.week35;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Math notes:
 * https://stackoverflow.com/questions/32534732/java-implementation-of-bernoulli-numbers-in-new-method
 * https://en.wikipedia.org/wiki/Faulhaber%27s_formula
 * https://www.programcreek.com/java-api-examples/index.php?source_dir=aic-util-master/src/main/java/com/sri/ai/util/math/BernoulliNumber.java
 * https://github.com/chaoxu/mgccl-oj/blob/master/acm_greaterny_2012/Faulhaber.java
 * https://en.wikipedia.org/wiki/Bernoulli_number http://people.reed.edu/~jerry/311/bernoulli.pdf
 * https://en.wikipedia.org/wiki/Pascal%27s_triangle
 * @author tmosest
 *
 */
public class HighwayConstruction {

  public static boolean debugMode = false;

  public static class Rational {
    long a, b;

    Rational(long n, long d) {
      if (d == 0) {
        a = 0;
        d = 1;
      } else {
        long gcd = gcd(n, d);
        a = n / gcd;
        b = d / gcd;
      }
    }

    Rational add(Rational r) {
      return new Rational(a * r.b + b * r.a, b * r.b);
    }

    Rational sub(Rational r) {
      return new Rational(a * r.b - b * r.a, b * r.b);
    }

    Rational mult(Rational r) {
      return new Rational(a * r.a, b * r.b);
    }
    
    Rational pow(int p) {
      int num = 1;
      int den = 1;
      for(int i = 0; i < p; i++) {
        num *= a;
        den *= b;
      }
      return new Rational(num, den);
    }

    static long gcd(long a, long b) {
      if (b == 0) {
        return a;
      } else {
        return gcd(b, a % b);
      }
    }

    public String toString() {
      if (b == 1) {
        return Long.toString(a);
      }
      if (b < 0) {
        return -a + "/" + -b;
      } else {
        return a + "/" + b;
      }
    }
  }

  private static class Faulhaber {

    private Rational[][] f;

    public Faulhaber(int size) {
      f = new Rational[size][0];
      f[0] = new Rational[1];
      f[0][0] = new Rational(1, 1);
      for (int r = 1; r < f.length; r++) {
        f[r] = new Rational[r + 1];
        Rational sum = new Rational(0, 1);
        for (int c = 1; c <= r; c++) {
          f[r][c] = (new Rational(r, c + 1)).mult(f[r - 1][c - 1]);
          sum = sum.add(f[r][c]);
        }
        f[r][0] = (new Rational(1, 1)).sub(sum);
      }
    }
    
    public Rational getBernolli(int i) {
      return f[i][0];
    }

    public void print() {
      for (int i = 0; i < f.length; i++) {
        System.out.println(Arrays.toString(f[i]));
      }
    }
  }

  public static class PascalsTriangle {
    // An auxiliary array to store generated pscal triangle values
    private int arr[][];

    public PascalsTriangle(int size) {
      arr = new int[size][size];
      generate();
    }

    private void generate() {
      // Iterate through every line and print integer(s) in it
      for (int line = 0; line < arr.length; line++) {
        // Every line has number of integers equal to line number
        for (int i = 0; i <= line; i++) {
          // First and last values in every row are 1
          if (line == i || i == 0)
            arr[line][i] = 1;
          else // Other values are sum of values just above and left of above
            arr[line][i] = arr[line - 1][i - 1] + arr[line - 1][i];
        }
      }
    }
    
    public int choose(int n, int k) {
      return arr[n][k];
    }
  }

  private static class FaulhaberPowers {
    private PascalsTriangle pt;
    private Faulhaber f;
    
    public FaulhaberPowers(int maxNum, int maxPower) {
      pt = new PascalsTriangle(maxNum);
      f = new Faulhaber(maxPower);
    }
    
    public Rational powerSum(int n, int p) {
      if(debugMode) {
        System.out.println("n: " + n + " p: " + p);
      }
      Rational nRation = new Rational(n, 1);
      Rational sum = new Rational(0, 1);
      Rational toDivide = new Rational(1, p + 1);
      if(debugMode) {
        System.out.println("nRation: " + nRation + " sum: " + sum + " toDivide: " + toDivide);
      }
      for(int i = 0; i <= p; i++) {
        Rational pascal = new Rational(pt.choose(p + 1, i), 1);
        Rational bernoli = f.getBernolli(i);
        Rational power = nRation.pow((p + 1) - i);
        if(debugMode) {
          System.out.println("i: " + i + " pascal: " + pascal + " bernoli: " + bernoli + " power: " + power);
        }
        sum = sum.add(power.mult(pascal).mult(bernoli));
      }
      return sum.mult(toDivide);
    }
  }
  
  public static Rational[] solve() {
    FaulhaberPowers fp = new FaulhaberPowers(10000, 1000);
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    //Rational[] r = new Rational[q];
    Rational one = new Rational(1,1);
    for(int i = 0; i < q; i++) {
      Rational cost = fp.powerSum(in.nextInt() - 1, in.nextInt()).sub(one);
      System.out.println(cost);
    }
    in.close();
    return null;
  }

  public static void main(String[] args) {
    solve();
  }

}
