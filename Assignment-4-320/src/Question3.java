import java.text.NumberFormat;
import java.util.Locale;

public class Question3 {

	public static void main(String[] args) {
		final double givenA = 12345.678;
		final double givenB = 12345.678;
		final String givenC = "12,345.678";
		
		try {
			// For letter a: Uses a United Kingdom locale for number formatting based on the instructions
			NumberFormat nfA = NumberFormat.getInstance(Locale.UK);
			
			// Limits the maximum number of decimal integers to 2
			nfA.setMaximumFractionDigits(2);
			
			// Formats it into a String
			String formattedA = nfA.format(givenA);
			
			// Prints it out
			System.out.println(formattedA);
			
			// For letter b: Uses the United States currency for number formatting based on the instructions
			NumberFormat nfB = NumberFormat.getCurrencyInstance(Locale.US);
			
			// Formats it into a String
			String formattedB = nfB.format(givenB);
			
			// Prints it out
			System.out.println(formattedB);
			
			// For letter c: Parses the given string into a number with the NumberFormat class based on the instructions
			NumberFormat nfC = NumberFormat.getInstance();
			
			// Parses it into a Number
			Number parsedC = nfC.parse(givenC);
			
			// Prints it out
			System.out.println(parsedC);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
