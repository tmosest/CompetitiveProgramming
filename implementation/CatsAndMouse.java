package implementation;

import java.util.Scanner;

public class CatsAndMouse {

	public static void catAndMoust(int catA, int catB, int Mouse) {
		int distA = Math.abs(catA - Mouse);
		int distB = Math.abs(catB - Mouse);
		if(distA == distB) {
			System.out.println("Mouse C");
		} else if(distA < distB) {
			System.out.println("Cat A");
		} else {
			System.out.println("Cat B");
		}
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            catAndMoust(x, y, z);
        }
    }
}
