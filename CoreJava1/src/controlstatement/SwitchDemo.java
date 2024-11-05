package controlstatement;

public class SwitchDemo {

	public static void main(String[] args) {
		int grade=7;
		//int grade=percentage/10;---->78.90-->7
		switch (grade) {
		case 10: {
			System.out.println("A+");
			break;
		}
		case 9:{
			System.out.println("Your grade is A");
			break;
		}
		case 8:{
			System.out.println("B");
			break;
		}
		default:
			System.out.println(grade);
		
		}

	}

}
