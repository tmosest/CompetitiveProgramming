package hackerrank.implementation;

import java.util.Scanner;

public class MigratoryBirds {

	static int migratoryBirds(int n, int[] ar) {
		int result = 0;
		int[] birdCounts = {0,0,0,0,0};
		for(int i = 0; i< n; i++) {
			++birdCounts[ar[i] - 1];
		}
		int most = 0;
		int mostCount = birdCounts[most];
		for(int  i = 1; i < birdCounts.length; i++) {
			if(birdCounts[i] > mostCount) {
				most = i;
				mostCount = birdCounts[i] ;
			}
		}
		result = most + 1;
		return result;
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        in.close();
        int result = migratoryBirds(n, ar);
        System.out.println(result);
	}

}
