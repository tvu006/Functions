import java.util.*;

/*
 * Tony Vu
 * Created: 15/12/2018
 * Prints all prime numbers starting and ending from given points
 */
public class PrimeFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		System.out.print("Enter the first number: ");
		int first = input.nextInt();
		System.out.print("Enter the last number: ");
		int last = input.nextInt();
		primes = primeOfInterval(first, last);
		System.out.println("Primes from " + first + " to " + last + " :" + primes.toString());
		System.out.println("Sum of primes: " + sum(primes));
		System.out.println("Product of primes: " + product(primes));
	}
	
	public static ArrayList<Integer> primeOfInterval(int first, int last) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		if (last <= first || first <= 1) System.out.println("Invalid input");
		for (int i = first; i < last; i++) {
			boolean prime = true;
			if (i > 1) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						prime = false;
						break;
					}
				}
				if (prime) {
					primes.add(i);
				} else {
					prime = true;
				}
			}
		}
		
		return primes;
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
