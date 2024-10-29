import java.io.FileReader;
import java.util.*;
import java.io.File;

public class Question2 {

	public static void main(String[] args) {
		final String fileName = "test.txt";
		
		try {
			// This reads the file and obtains its length
			File fInfo = new File(fileName);
			int fLen = (int)fInfo.length();

			// This creates a character array or buffer from the file's entire length
			char[] fileChars = new char[fLen];
			
			// This reads the file into a character array by the file's entire length
			FileReader fileReader = new FileReader(fileName);
			fileReader.read(fileChars, 0, fLen);
			fileReader.close();
			
			// This creates a string array of words from the character array from splitting the file through spaces
			String[] fileString = new String(fileChars).split(" ");
			
			// This creates a TreeSet from the string array which is sorted in ascending order and removes duplicate strings
			TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(fileString));
			
			// This iterates through the TreeSet
			for (String setElement : treeSet) {
				System.out.println(setElement);
			}
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
