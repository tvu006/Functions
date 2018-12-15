import java.util.*;

/*
 * Tony Vu
 * 15/12/2018
 * Prints all possible combinations of the characters in a string
 */

public class CharacterCombos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String word = input.nextLine();
		String[] solutions = new String[factorial(word.length())];
		int counter = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < factorial(word.length() - 1); j++) {
				solutions[counter] = (word.charAt(i) + "");
				counter++;
			}
		}
		for (int i = 0; i < word.length(); i++) {
			add(word, solutions);
		}
		for (String x: solutions) {
			System.out.println(x);
		}
	}
	private static String[] add(String word, String[] array) {
		int counter = 0;
		for (int i = 0; i < factorial(word.length()); i++) {
			if (contains(array[i], word.charAt(counter))) {
				if (array[i].length() != word.length()) {
					i--;
				}
			} else {
				array[i] += word.charAt(counter);
			}
			if (counter == word.length() - 1) {
				counter = 0;
			} else {
				counter++;
			}
			
		}
		return array;
	}
	
	private static boolean contains(String word, char letter) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				return true;
			}
		}
		return false;
	}
	private static int factorial(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}
