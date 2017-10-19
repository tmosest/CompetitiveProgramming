package hackerrank.implementation;

import java.util.Scanner;

public class BonAppetit {
	
	public static boolean debugMode = true;
	
	static int bonAppetit(int n, int k, int b, int[] ar) {
        int result = 0;
                
        int costOfSharedFood = 0;
        
        for(int i = 0; i < n; i++) {
        		if(i != k) costOfSharedFood += ar[i];
        }
        
        costOfSharedFood /= 2;
        
        if(b > costOfSharedFood) result = b - costOfSharedFood;
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        in.close();
        int result = bonAppetit(n, k, b, ar);
        if(result != 0)
        		System.out.println(result);
        else
        		System.out.println("Bon Appetit");
    }
}
