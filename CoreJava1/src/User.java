meeimport java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name");	
		String name=sc.nextLine();
		System.out.println("Name :"+name);
		System.out.println("Enter ur age");
		int age=sc.nextInt();
		System.out.println("Age :"+age);
		System.out.println("Enter ur percentage");
		float percentage=sc.nextFloat();
		System.out.println("Percentage :"+percentage);
		System.out.println("Enter ur grade");
		char ch=sc.next().charAt(0);
		System.out.println("Grade :"+ch);
		

	}

}
