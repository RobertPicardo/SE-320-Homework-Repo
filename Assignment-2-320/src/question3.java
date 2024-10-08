import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Please enter a number between 0 and 10:");
		try {
			num = scanner.nextInt();
			scanner.close();
			assert num >= 0 && num <= 10 : "The entered number is out of range";
		}catch (Exception e) {
			scanner.close();
			System.out.print(e);
		}

	}

}
