import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		GenericStack<Integer> stackDefault;
		GenericStack<Integer> stackUserInput;
		Scanner scanner = new Scanner(System.in);
		
		stackDefault = new GenericStack<Integer>();
		
		System.out.println("What size should the second array be?:");
		try {
			int arraySize = scanner.nextInt();
			stackUserInput = new GenericStack<Integer>(arraySize);
			for(int i = 0; i < arraySize * 2; i++) {
				stackUserInput.push(i);
			}
			System.out.println(arraySize);
			System.out.println(stackUserInput.getLength());
			System.out.println(stackUserInput.peek());
			System.out.println(stackUserInput.pop());
			System.out.println(stackUserInput.getSize());
		}catch (Exception e) {
			System.out.print(e);
		}
		
		
	}

}
