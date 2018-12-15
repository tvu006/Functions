import java.util.*;

/*
 * Tony Vu
 * 14/12/2018
 * Prints the first string, cutting one character every print
 * then prints the second string, with one more character every print
 */
public class Morph {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		String first = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String second = scanner.nextLine();
		
		int similarChars = 1;
		if (first.charAt(0) == second.charAt(0)){
				similarChars++;
		}
		
		for (int j = first.length(); j > 0; j--) {
			System.out.println(first.substring(0, j));
		}
		for (int k = similarChars; k <= second.length(); k++) {
			System.out.println(second.substring(0, k));
		}
	}
}
