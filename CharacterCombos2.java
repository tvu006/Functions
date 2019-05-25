import java.util.*;

/*
 * Tony Vu
 * 13/05/2019
 * Prints all possible permutations of a string, even with repeating characters
 */

public class CharacterCombos2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String word = "";
		
		System.out.println("Enter a string: ");
		word = input.nextLine();
		
		System.out.println("Permutations: ");
		TreeSet<String> solutions = solutions("", word);
		for (String x: solutions) {
			System.out.println(x);
		}
		System.out.println("Number of permutations: " + solutions.size());
	}
	
	private static TreeSet<String> solutions(String word, String remaining) {
		TreeSet<String> solutions = new TreeSet<String>();
		for (int i = 0; i < remaining.length(); i++) {
			if (remaining.length() > 1) {
				TreeSet<String> array = solutions(word + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
				for (String x: array) {
					solutions.add(x);
				}
			} else {
				solutions.add(word += remaining.charAt(0));
			}
		}
		return solutions;
	}
}
