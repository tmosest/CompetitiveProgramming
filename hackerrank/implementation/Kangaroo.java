package hackerrank.implementation;

import java.util.Scanner;

public class Kangaroo {
	
	static double determineTimeOfPassing(int x1, int v1, int x2, int v2) {
		double x = x1 - x2;
		int v = v2 - v1;
		return x / v;
	}
	
	/**
	 * D = V2 ( T ) + X2
	 * D = V1 ( T) + X1
	 * V1 ( T ) + X1 = V2 ( T ) + X2
	 * X1 - X2 = V2 (T) - V1 (T) = T (V2 - V1)
	 * T = (X1 - X2) / (V2 - V1) 
	 * @param x1
	 * @param v1
	 * @param x2
	 * @param v2
	 * @return
	 */
	static String kangaroo(int x1, int v1, int x2, int v2) {
		boolean same = ((x1 - x2) / (v2 - v1) ) >= 0 && ((x1 - x2) % (v2 - v1) ) == 0;
		return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
    
}
