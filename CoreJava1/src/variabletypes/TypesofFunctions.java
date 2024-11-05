package variabletypes;

public class TypesofFunctions {
	void msg() {
		System.out.println("Message function");
	}
	//function with string return type
	String display() {
		return" My display method";
	}
	//function with string return type parameter
	String getting(String s) {
		return "Hello" +s;
	}
	//function return type int
	int add() {
		int a=4,b=5;
		return a+b;
	}
	//function with return type int and parameter
	int mul(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		TypesofFunctions t=new TypesofFunctions();
		t.msg();
		System.out.println(t.display());
		System.out.println(t.getting( "--->12615"));
		System.out.println("Addition:"+t.add());
		int m =t.mul(3,4);
    	System.out.println("Multiplication:"+m);
		int m1=t.mul(13,4);
    	System.out.println("Multiplication:"+m1);

		



	}

}
