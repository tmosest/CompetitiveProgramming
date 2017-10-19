package hackerrank.implementation;

import java.util.Scanner;

public class AppleAndOrange {
	
	public static int determineApplePosition(int applePos, int a) {
		return a + applePos;
	}
	
	public static int determineOrangePosition(int orangePos, int b) {
		return b + orangePos;
	}
	
	public static boolean isOnHouse(int fruitPosition, int s, int t) {
		if(s <= fruitPosition && fruitPosition <= t)
			return true;
		return false;
	}
	
	public static int countApplesOnHouse(int s, int t, int a, int[] apples) {
		int count = 0;
		for(int i = 0; i < apples.length; i++) {
			int pos = determineApplePosition(apples[i], a);
			if(isOnHouse(pos, s, t)) ++count;
		}
		return count;
	}
	
	public static int countOrangesOnHouse(int s, int t, int b, int[] oranges) {
		int count = 0;
		for(int i = 0; i < oranges.length; i++) {
			int pos = determineApplePosition(oranges[i], b);
			if(isOnHouse(pos, s, t)) ++count;
		}
		return count;
	}
	
	public static void countFruit(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int[] counts = new int[2];
		counts[0] = countApplesOnHouse(s, t, a, apples);
		counts[1] = countOrangesOnHouse(s, t, b, oranges);
		System.out.println(counts[0]);
		System.out.println(counts[1]);
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        in.close();
        countFruit(s, t, a, b, apple, orange);
    }
}
