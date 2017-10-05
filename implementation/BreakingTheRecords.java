package implementation;

import java.util.Scanner;

public class BreakingTheRecords {

	static int[] getRecord(int[] s) {
		int[] result = {0, 0};
		
		int highestScore = s[0];
		int lowestScore = highestScore;
		
		for(int i = 1; i < s.length; i++) {
			int score = s[i];
			if(score > highestScore) {
				++result[0];
				highestScore = score;
			}
			if(score < lowestScore) {
				++result[1];
				lowestScore = score;
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
	}

}
