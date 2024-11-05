package variabletypes;

public class LocalVariable {
	int printAge() {
	int age=0;
	age=age+30;
	System.out.println("Age:"+age);
	return age;
	}
	public static void main(String[]args) {
		LocalVariable l=new LocalVariable();
		l.printAge();
	}

	

}
