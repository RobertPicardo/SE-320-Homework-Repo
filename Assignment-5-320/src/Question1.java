import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {	
			System.out.println("Please enter the current date. The format should look like this:\n[Year] [Month] [Day]\nwith spaces between the integers.");
		
			int year = scanner.nextInt();
			int month = scanner.nextInt();
			int date = scanner.nextInt();
			
			Day today = new Day(year, month, date);
			scanner.nextLine();
			
			System.out.println("\nNow please enter your birthday. It should follow the same format.");
			
			year = scanner.nextInt();
			month = scanner.nextInt();
			date = scanner.nextInt();
			
			Day birthday = new Day(year, month, date);
			
			System.out.printf("It has been exactly %d days since your birth.", today.daysFrom(birthday));
		} catch (Exception e) {
			System.out.print(e);
			try {
			scanner.nextLine();
			}catch(Exception _e) {};
			System.out.print("\nInvalid response, or the format may be incorrect.\n\n");
		}
		scanner.close();
	}

}
