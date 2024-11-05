package controlstatement;

public class Typesconversation {

	public static void main(String[] args) {
		byte b=100;
		short s=b;
		int i=s;
		long l=i;
		//byte->short->int->long->implicit type conversation(widening
		
		double d=345.894d;
		int ii=(int) d;
		System.out.println("ii :"+ii);
		 //bigger data type-->smaller data type
		//double->integer->short->byte->explicit scope(narrowing)
		int iii=800;
		byte bb=(byte) iii;
		System.out.println("bb :"+bb);
		float f1=56.89f;
		int no=(int)f1;

	}

}
