import java.util.*;

/*
 * Tony Vu
 * 22/04/2019
 * Prints calculates all possible permutations of the characters
 */

public class CharacterCombos2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String word = "";
		
		System.out.println("Enter a string: ");
		word = input.next();
		
		System.out.println("Number of permutations: " + calcPerm(word));
	}

	private static int calcPerm(String word) {
		String characters = "";
		
		for (int i = 0; i < word.length(); i++) {
			boolean contains = false;
			for (int j = 0; j < characters.length(); j++) {
				if (characters.charAt(j) == word.charAt(i)) {
					contains = true;
					break;
				}
			}
			if (!contains) {
				characters += word.charAt(i);
			}
		}
		
		int[] occurances = new int[characters.length()];
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j <= i; j++) {
				if (characters.charAt(j) == word.charAt(i)) {
					occurances[j]++;
					break;
				}
			}
		}
		int divide = 1;
		for (int num: occurances) {
			divide *= factorial(num);
		}
		return factorial(word.length()) / divide;
	}
	
	private static int factorial(int n) {
		if (n <= 0) {
			return 0;
		} else {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		}
	}
	
	
}
