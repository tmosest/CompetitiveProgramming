package implementation;

import java.util.Scanner;

public class FormingAMagicSquare {
	
	private static final boolean debugMode = true;

	private static final int[][] allMagicSquares = {
			{8, 1, 6, 3, 5, 7, 4, 9, 2}, 
			{6, 1, 8, 7, 5, 3, 2, 9, 4},
	        {4, 3, 8, 9, 5, 1, 2, 7, 6}, 
	        {2, 7, 6, 9, 5, 1, 4, 3, 8},
	        {2, 9, 4, 7, 5, 3, 6, 1, 8}, 
	        {4, 9, 2, 3, 5, 7, 8, 1, 6},
	        {6, 7, 2, 1, 5, 9, 8, 3, 4}, 
	        {8, 3, 4, 1, 5, 9, 6, 7, 2}
	};
	
	public static int costOfMagicSquare(int[] square) {
		int minCost = Integer.MAX_VALUE;
		
		for(int i = 0; i < allMagicSquares.length; i++) {
			int cost = 0;
			for(int j = 0; j < square.length; j++) {
				if(allMagicSquares[i][j] != square[j])
					cost += Math.abs(allMagicSquares[i][j] - square[j]);
				if(debugMode) {
					System.out.println("magic value: " + allMagicSquares[i][j] + " square: " + square[j]);
					System.out.println("cost : " + cost);
				}
			}
			if(cost < minCost) minCost = cost;
			if(debugMode)
				System.out.println("minCost : " + minCost);
		}
		
		return minCost;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] s = new int[9];
        for(int s_i=0; s_i < s.length; s_i++){
            s[s_i] = in.nextInt();
        }
        in.close();
        //  Print the minimum cost of converting 's' into a magic square
        System.out.println(costOfMagicSquare(s));
    }
}
