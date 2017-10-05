package implementation;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

	private static boolean debugMode = true;
	
	static int getGcd(int a, int b) {
		BigInteger b1 = BigInteger.valueOf(a);
	    BigInteger b2 = BigInteger.valueOf(b);
	    BigInteger gcd = b1.gcd(b2);
	    return gcd.intValue();
	}
	
	static int getLcm(int a, int b) {
		return (a * b) / getGcd(a, b);
	}
	
	static int getGcd(int[] array) {
		int gcd = array[0];
		for(int i = 0; i < array.length; i++) {
			gcd = getGcd(gcd, array[i]);
		}
		return gcd;
	}
	
	static int getLcm(int[] array) {
		int lcm = array[0];
		for(int i = 0; i < array.length; i++) {
			lcm  = getLcm(lcm, array[i]);
		}
		return lcm;
	}
	
	static int getTotalX(int[] a, int[] b) {
		int result = 0;
		int lcmA = getLcm(a);
		int gcdB = getGcd(b);
		if(debugMode) {
			System.out.println("LCM of a: " + lcmA);
			System.out.println("GCD of b: " + gcdB);
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = a[a.length - 1]; i <= b[0]; i++) {
			if(i % lcmA == 0 && gcdB % i == 0) ++result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
	}

}
