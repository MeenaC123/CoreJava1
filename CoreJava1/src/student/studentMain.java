package student;

public class studentMain { 
	String name="Meena";
	void callstudent() {
		System.out.println("call student");
	}
	void gretting(String center) {
		System.out.println("Hello"+center+"learner");
	}
    public static void main(String[]args) {
    	int age=24;
    	studentMain s=new studentMain();
    	System.out.println("Name:"+s.name);
    	System.out.println("Age:"+age);
    	s.callstudent();
    	s.gretting("kaplambadi");
    	System.out.println("Error in my code");
  }
}