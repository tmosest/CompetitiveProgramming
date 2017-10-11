package implementation;

import java.util.Scanner;

/**
 * Algorithms -> Implementations -> Cut the sticks Easy (Super Easy)
 */
public class CutTheSticks {

  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();
        boolean cutting = true;
        //While loop
        while(cutting) {
            //Output #sticks 
            //and Find the smallest
            //Cut each by the smallest   
            int sticks = 0;
            int smallest = 1000000;
            for(int arr_i=0; arr_i < n; arr_i++){
                if(arr[arr_i] > 0) sticks++;
                if(arr[arr_i] > 0 && arr[arr_i] < smallest) smallest = arr[arr_i];
            }
            if(sticks > 0) System.out.println(sticks);
            //Cut each by the smallest
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] -= smallest;
            }
            if(sticks <= 1) cutting = false;
        }
    }



}
