package Loopex;

public class EnumExample1 {
	enum Rainbow{
		RED,
		ORANGE,
		YELLOW,
		GREEN,
		BLUE,
		INDIGO,
		VIOLET
	}

	public static void main(String[] args) {
		Rainbow colors=Rainbow.RED;
		switch(colors) {
		case RED:
			System.out.println("color is Red");
			break;
		case ORANGE:
			System.out.println("color is Orange");
			break;
		case YELLOW:
			System.out.println("color is Yellow");
			break;
		case GREEN:
			System.out.println("color is Green");
			break;
		case BLUE:
			System.out.println("color is Blue");
			break;
		case INDIGO:
			System.out.println("color is Indigo");
			break;
		case VIOLET:
			System.out.println("color is Violet");
			break;
		}
	System.out.println("**************");
	//loop through th enum values
	for(Rainbow rainbow:Rainbow.values()) {
		System.out.println(Rainbow.values()+"===="+rainbow);	
		}
		
	

	}

}
