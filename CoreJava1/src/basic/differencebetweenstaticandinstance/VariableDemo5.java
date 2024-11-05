package differencebetweenstaticandinstance;

public class VariableDemo5 {
	static int count=0;//static
	 int cnt=0;//instance
	public void increment() {
		count++;
	}
	public void incre(){
		cnt++;
    }
}

	public class VariableDemo{

	public static void main(String args[]) {
		VariableDemo5 v=new VariableDemo5();
		v.increment();
		System.out.println("Count static:"+VariableDemo5.count);//1
		VariableDemo5 v1=new VariableDemo5();
		v1.increment();
		System.out.println("Count static 2 time:"+VariableDemo5.count);
		VariableDemo5 v2=new VariableDemo5();
		v2.incre();
		System.out.println("Count instance:"+v2.cnt);
		VariableDemo5 v3=new VariableDemo5();
		v3.incre();
		System.out.println("Count instance:"+v3.cnt);
	}

	}


    	

	


