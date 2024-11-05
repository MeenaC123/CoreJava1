package differencebetweenstaticandinstance;

public class VariableDemo1 {
	static int count=0;//static
	 int cnt=0;//instance
	public void increment() {
		count++;
	}
	public void incre(){
		cnt++;
    }

	public class StaticEx{

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		VariableDemo1 v=new VariableDemo1();
		v.increment();
		System.out.println("Count static:"+VariableDemo1.count);//1
		VariableDemo1 v1=new VariableDemo1();
		v1.increment();
		System.out.println("Count static 2 time:"+VariableDemo1.count);
		VariableDemo1 v2=new VariableDemo1();
		v2.incre();
		System.out.println("Count instance:"+v2.cnt);
		VariableDemo1 v3=new VariableDemo1();
		v3.incre();
		System.out.println("Count instance:"+v3.cnt);
	}

	}
}

    	

	


