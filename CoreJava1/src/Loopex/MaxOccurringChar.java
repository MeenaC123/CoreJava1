package Loopex;

import java.util.Scanner;

public class MaxOccurringChar {
	public static char maxOccuringChar(String str) {
		int[]charCount=new int[256];
		int maxCount=0;
		char result=' ';
		
		for(int i=0;i<str.length();i++) {
			charCount[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(maxCount<charCount[str.charAt(i)]) {
				maxCount=charCount[str.charAt(i)];
				result=str.charAt(i);
				
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=scanner.nextLine();
		System.out.println("The maximum occuring character is:"+maxOccuringChar(str));
		
		

		
	}

}
