package controlstatement;

import java.util.Scanner;

public class MaxNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a,b,c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//check no is +ve,-ve or zero(no>0=>+ve
		if(a>b && a>c) {
			System.out.println(a +"is max");	
		}
		else if(b>a && b>c) {
			System.out.println(b +"is max");	
		}
		else
		{
			System.out.println(c +"is max");
		}
		sc.close();
		}

	}


