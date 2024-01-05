package b;

public class DemoB {
	public static void main(String[] args) {
		
		System.out.println("February");
	
	//coming from local repo	
		System.out.println("Monday, Tuesday...");
		
	}
	
	//coming from local repo
	public boolean isVacation (String day, int time) {
		boolean result = false;
		
		if (day == "Saturday" && time == 1) {
			result = true;
		}
		
		return result;
	}

}
