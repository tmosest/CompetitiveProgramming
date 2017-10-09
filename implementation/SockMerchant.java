package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

	private static boolean debugMode = false;
	
	static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        Arrays.sort(ar);
        int lookingFor = ar[0];
        if(debugMode) {
        		System.out.println("Starting with: " + lookingFor);
        }
        for(int i = 1; i < n; i++) {
	        	if(debugMode) {
	        		System.out.println("i: " + i + " Comparing to: " + ar[i]);
	        }
        		if(lookingFor == ar[i]) {
        			++pairs;
        			if(i + 1 < n)
        				lookingFor = ar[++i];
        			if(debugMode) {
	    	        		System.out.println("pairs: " + pairs + " looking for: " + lookingFor);
	    	        }
        		} else {
        			lookingFor = ar[i];
        			if(debugMode) {
    	        			System.out.println("new looking for: " + lookingFor);
        			}
        		}
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
    
}
