package variabletypes;
class Demo{
	static String deg= "BTECH";
	String uname="University of chennai";
}
public class InstanceVariableEx {
	static int $A =10;
	int marks=100;
	void greetings(String name) {
		String no= "dn";//Local variable-scope within method->line
		System.out.println("Welcome"+name);
	}
	void printNumber() {
		for(int j=1;j<=5;j++) {
			System.out.println("J:"+j);

		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A:"+$A);
		InstanceVariableEx i=new InstanceVariableEx();
		System.out.println("Marks:"+i.marks);
		i.greetings("EB");
		//if static variable outside class->anotherclass->classname.variable
		System.out.println("Degree:"+Demo.deg);
		Demo d=new Demo();
		System.out.println("University Name:"+d.uname);

	}

}
