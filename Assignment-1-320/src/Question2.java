import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class Question2 {

	public static void main(String[] args) {
		
		int[] arrayOfRandNumbers;
		arrayOfRandNumbers = new int[100];
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		boolean validNumber = false;
		
		for(int i = 0; i < 100; i++) {
			arrayOfRandNumbers[i] = rand.nextInt(100);
		}
		
		System.out.println("Which index would you like to look at? (choose from 0-99):");
		while(validNumber == false) {
			try {
				if (scanner.hasNextInt()) {
			        userInput = scanner.nextInt();
					System.out.printf("The number at array index #%d is %d!", userInput, arrayOfRandNumbers[userInput]);
					validNumber = true;
				}else {
					scanner.next();
					throw new InputMismatchException();
				}
	        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
	            System.out.print("Out of Bounds\nPlease try again: ");
	        }
		}

		scanner.close(); 
	}
}
