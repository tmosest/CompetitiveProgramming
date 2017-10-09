package implementation;

import java.util.Scanner;

public class CountingValleys {

	public static int countValleys(String walk) {
		int valleys = 0;
		int direction = 0;
		
		for(int i = 0; i < walk.length(); i++) {
			char step = walk.charAt(i);
			direction += (step == 'U') ? 1 : -1;
			if(direction == 0 && step == 'U') 
				++valleys;
		}
		
		return valleys;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String walk = in.nextLine();
		in.close();
		
		System.out.println(countValleys(walk));
	}
}
