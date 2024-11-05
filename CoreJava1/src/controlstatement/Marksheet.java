package controlstatement;

import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur Marks");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int score=a+b+c;
		System.out.println(score);
		int per=score/300*100;
		System.out.println(per);
		if(per>=90) {
			System.out.println("A+ Grade");
		}else if (per>=80 && per<90) {
			System.out.println("A Grade");
		}else if (per>=70 && per<80){
		    System.out.println("B+ Grade");
	    }else if (per>=60 && per<70){
             System.out.println( "B Grade"); 
        }else if(per>=50 && per<60) {
	         System.out.println(" C Grade");   
        }else if(per>=40 && per<50){
	         System.out.println("pass");
        }else {
	         System.out.println("Fail");
        }
		sc.close();
}
}
              

