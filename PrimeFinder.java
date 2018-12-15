import java.util.*;

/*
 * Tony Vu
 * 15/12/2018
 * Prints all prime numbers starting and ending from given points
 */
public class PrimeFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first = input.nextInt();
		System.out.print("Enter the last number: ");
		int last = input.nextInt();
		primeOfInterval(first, last);
	}
	
	public static void primeOfInterval(int first, int last) {
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
					System.out.print(i + " ");
				} else {
					prime = true;
				}
			}
		}
	}
}
