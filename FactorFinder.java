import java.util.*;

/*
 * Tony Vu
 * Created: 15/12/2018
 * Prints all of the factors of a given decimal number and
 * the sum and product of its factors
 */
public class FactorFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> factors = new ArrayList<Integer>();
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		factors = factors(x);
		System.out.println("Factors of " + x + ": " + factors.toString());
		System.out.println("Sum of factors: " + sum(factors));
		System.out.println("Product of factors: " + product(factors));
	}
	
	public static ArrayList<Integer> factors(int number) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		if (number < 1) {
			System.out.print("Invalid input.");
			System.exit(1);
		}
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}
	
	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for (int i: list) {
			sum += i;
		}
		return sum;
	}
	
	public static int product(ArrayList<Integer> list) {
		int product = 1;
		for (int i: list) {
			product *= i;
		}
		return product;
	}
}
