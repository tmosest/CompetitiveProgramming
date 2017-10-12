package hackerrank.implementation;

import java.util.Scanner;

public class DrawingBook {

	static int solve(int n, int p){
		
		int turnsFromFront = 0;
		int turnsFromBack = 0;
		
		int leftPage = 0;
		int rightPage = 1;
		
		while(leftPage != p && rightPage != p) {
			++turnsFromFront;
			leftPage += 2;
			rightPage += 2;
		}
		
		leftPage = n - 1;
		rightPage = n;
		
		if(n % 2 == 0) {
			leftPage = n;
			rightPage = n + 1;
		}
		
		while(leftPage != p && rightPage != p) {
			++turnsFromBack;
			leftPage -= 2;
			rightPage -= 2;
		}
		
		return (turnsFromBack < turnsFromFront) ?
				turnsFromBack : turnsFromFront;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
    
}
