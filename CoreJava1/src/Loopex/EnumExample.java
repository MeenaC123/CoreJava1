package Loopex;

public class EnumExample { 
	enum Day{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}

	public static void main(String[] args) {
		Day today=Day.MONDAY;
		switch(today) {
		case SUNDAY:
			System.out.println("Today is sunday");
            break;
		case MONDAY:
			System.out.println("Today is monday");
			break;
		case TUESDAY:
			System.out.println("Today is Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Today is Wednesday");
			break;
		case THURSDAY:
			System.out.println("Today is Thursday");
			break;
		case FRIDAY:
			System.out.println("Today is Friday");
			break;
		case SATURDAY:
			System.out.println("Today is Saturday");
            break;
			
		}
		System.out.println("******************");

  //Loop through the enum values
		for (Day day:Day.values()) {
			System.out.println(Day.values()+"======"+day);

		}
	}

}
