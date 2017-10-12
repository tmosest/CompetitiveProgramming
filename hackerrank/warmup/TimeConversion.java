package hackerrank.warmup;

import java.util.Scanner;

public class TimeConversion {

	private static boolean debugMode = false;

	static String timeCoversion(String s) {
		StringBuilder sb = new StringBuilder();
        String suffix = s.substring(s.length() - 2, s.length());
        boolean isPM = suffix.equals("PM");
        String[] time = s.substring(0, s.length() - 2).split(":");
	    if(debugMode) {
            System.out.println("Suffix: " + suffix);
            for(int i = 0; i < time.length; i++) {
                System.out.println(time[i]);
            }
        }
        int hours = Integer.valueOf(time[0]);
        if(isPM) { 
            if(hours != 12) {
                hours += 12;
            }
        } else {
            if(hours == 12) {
                hours = 0;
            }
        }
        if(hours < 10) {
            sb.append("0");
        }
        sb.append(String.valueOf(hours));
        sb.append(":");
        for(int i = 1; i < time.length; i++) {
            sb.append(time[i]);
            if(i != time.length - 1) sb.append(":");
        }
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeCoversion(s);
        System.out.println(result);
	}
}

