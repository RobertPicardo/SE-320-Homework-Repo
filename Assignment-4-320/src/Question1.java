import java.util.LinkedHashSet;

public class Question1 {

	public static void main(String[] args) {
		// Turns the 1st given string array into a LinkedHashSet
		LinkedHashSet<String> setA = new LinkedHashSet<>();
		setA.add("George");
		setA.add("Jim");
		setA.add("John");
		setA.add("Blake");
		setA.add("Kevin");
		setA.add("Michael");
		
		// Turns the 2nd given string array into a LinkedHashSet
		LinkedHashSet<String> setB = new LinkedHashSet<>();
		setB.add("George");
		setB.add("Katie");
		setB.add("Kevin");
		setB.add("Michelle");
		setB.add("Ryan");
		
		// Creates a union LinkedHashSet and prints it out
		LinkedHashSet<String> unionSet = new LinkedHashSet<>();
		
		// Adds all of setA
		unionSet.addAll(setA);
		
		// Adds all of setB but eliminates the duplicates and sorts it automatically because it is a LinkedHashSet
		unionSet.addAll(setB);
		
		System.out.println(unionSet);
		
		// Creates an intersection LinkedHashSet and prints it out
		LinkedHashSet<String> intersectionSet = new LinkedHashSet<>();
		
		// Adds all of setA
		intersectionSet.addAll(setA);
		
		// Leave only anything that is also present in setB which outputs only the duplicates
		intersectionSet.retainAll(setB);
		
		System.out.println(intersectionSet);
		
		// Creates a difference LinkedHashSet and prints it out
		LinkedHashSet<String> differenceSet = new LinkedHashSet<>();
		
		// Adds all of setA
		differenceSet.addAll(setA);
		
		// Remove anything that is present from setB in setA to eliminate duplicates
		differenceSet.removeAll(setB);
		
		System.out.println(differenceSet);

	}

}
