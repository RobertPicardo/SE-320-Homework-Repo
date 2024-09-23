import java.util.InputMismatchException;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		
		int userInput1 = 0;
		int userInput2 = 0;
		boolean validNumber = false;
		System.out.println("Please input a number!!!: ");
		Scanner scanner = new Scanner(System.in);
		
			while(validNumber == false) {
				try {
		        userInput1 = scanner.nextInt();        
		        validNumber = true;
		        } catch (InputMismatchException e) {
		            System.out.print("\nInvalid input (or the number was too large). Please try again: ");
		            scanner.next();
		        }
			}
			
		
		System.out.println("\nNow please input a second number!!!: ");
		validNumber = false;
			while(validNumber == false) {
				try {
		        userInput2 = scanner.nextInt();
		        validNumber = true;
		        } catch (InputMismatchException e) {
		        	System.out.print("\nInvalid input (or the number was too large). Please try again: ");
		            scanner.next();
		        }
			}
			
		System.out.printf("\nThe sum of your two numbers, %d and %d, is %d!", userInput1, userInput2, (userInput1 + userInput2));
		
		scanner.close();
	}

}
