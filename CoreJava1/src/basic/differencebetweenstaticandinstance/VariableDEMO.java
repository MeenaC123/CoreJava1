package differencebetweenstaticandinstance;
class VariableDemo{
	static int count1=0;//static
	 int cnt1=0;//instance
	public void incre1() {
		count1++;
	}
	public void incre2(){
		cnt1++;
    }
	}
	public class VariableDEMO{

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		VariableDemo v=new VariableDemo();
		v.incre1();
		System.out.println("Count static:"+VariableDemo.count1);//1
		VariableDemo v1=new VariableDemo();
		v1.incre1();
		System.out.println("Count static 2 time:"+VariableDemo.count1);
		VariableDemo v2=new VariableDemo();
		v2.incre1();
		System.out.println("Count instance:"+v2.cnt1);
		VariableDemo v3=new VariableDemo();
		v3.incre1();
		System.out.println("Count instance:"+v3.cnt1);
	}

}

    	



    	

	
	