import java.util.*;

/*
 * Tony Vu
 * 15/12/2018
 * Prints all of the factors of a given decimal number
 */
public class FactorFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		factors(input.nextInt());
	}
	
	public static void factors(int number) {
		if (number < 1) System.out.print("Invalid input.");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
