package variabletypes;

public class ArithmeticEx {

	public static void main(String[] args) {
		int a=100;
		int x=a++;//post increment
		//x=a--->a=a+1
		System.out.println("Value of X:"+x);
		int b=100;
		int y=++b;//pre increment
		//b=b+1-->y=b
		System.out.println("Value of Y:"+y);
		 
		int a1=100;
		int x1=a1--;//post decrement
		//x1-a1-->a1-a1-1
		System.out.println("Value of X1:"+x1);
		
		int b1=100;
		int y1=--b1;//pre decrement
		//b-b+1-->y=b
        System.out.println("Value of Y1:"+y1);
		
		
		int xx=100;
		System.out.println("Nagation of XX:"+(~xx));
		
		int a11= 10;
		//double
//		System.out.println("Left :::"+(a11<<1));
//		System.out.println("Left :::"+(a11<<2));
		
//		int b11=10;
//		//half the no
//		System.out.println("Right :::"+(a11>>1));
//		System.out.println("Right :::"+(a11>>2));
//		//Relational--->Boolean(true\false)
		
		 int no1=10;
		 int no2=20;
		 //a==b,
		 //a!=b,   a<b,  a>b    a>=b   a<=b
//		 System.out.println(" -- "+(no1!=no2));
//		 float output;
//		 output=(float) (1/0.5);
//		 System.out.println(output);
		 //Logical
//		 int f1=8;
//		 int f2=26;
//		 int f3=24;
//		 System.out.println("Bitwise AND:"+(f1&f2));
//		 System.out.println("Bitwise OR:"+(f1|f2));
//		 System.out.println("Logical AND:"+((f1>f2)&&(f2>f3)));
//		 System.out.println("Logical OR:"+((f1>f2)||(f2>f3)));
		 int a2=20,b2=35;
		 int max=a2>b2?a2:b2;//condition?true:false
		 System.out.println("Max : "+max);
	//   int no =23;
    //   String res=no%2==0?"Even":"Odd";
   //    System.out.println("Result :"+res);
	//	 if(no%2==0) {
	//	 System.out.println("Even");
	//	 }
	//      else {
	//		 System.out.println("Odd");
	//	 }
	//	 //String result=a2>b2?" a2 is greater":"b2 is greater";//condition
	//	 //System.oout.println("Max :"+result);

                   	


		
		

	}

}
