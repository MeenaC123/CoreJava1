package differencebetweenstaticandinstance;
class Variabledemo4{
	static int count=0;//static
	 int cnt=0;//instance
	 
	public void increment() {
		count++;
	}
	
	public void incre(){
		cnt++;
	}
	
   }

public class StaticEx {
	public static void main(String[] args) {
		VariableDemo =new v
		/*
		 * static variables are shared among the instance of the class
		 * useful when we need to do memory management.in some cases
		 * commmon value for all the instance like global variable the
		 * better to declare them static   as this can save memory( because)
		 * copy is created for static variables.
		 */
		VariableDemo obj1=new VariableDemo();
		VariableDemo obj2=new VariableDemo();
		VariableDemo obj3=new VariableDemo();
		VariableDemo obj4=new VariableDemo();
		obj1.increment();//count-1
		obj2.increment();//count-
        obj1.incre();//cnt-1
        obj2.incre();//cnt-1
        System.out.println("Obj1 Static:count is="+obj1.count);
        System.out.println("Obj2 Static:count is="+obj2.count);
        System.out.println("Obj1 Instance:count is="+obj1.cnt);//0--->1
        System.out.println("Obj2 Instance:count is="+obj2.cnt);//0-->
        System.out.println("Obj3 Instance:count is="+obj3.cnt);//0
        System.out.println("Obj4 Instance:count is="+obj4.cnt);//0




        



}

}

