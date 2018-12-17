import java.util.*;

/*
 * Tony Vu
 * Created: 16/12/2018
 * Prints the fibonacci sequence to the nth number
 */
public class fibonacci {
	private static int[] numbers;
	
	public static void main(String args[]) {
		int x;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		x = input.nextInt();
		if (x < 2) {
			System.out.println("Invalid input.");
			System.exit(1);
		}
		
		numbers = new int[x];
		numbers[0] = 1; numbers[1] = 1;
		for (int i = 2; i < numbers.length; i++) {
			numbers[i] = numbers[i - 1] + numbers[i - 2];
		}
		
		System.out.println("The first " + x + " numbers in the fibonacci sequence are:");
		for (int y: numbers) {
			System.out.print(y + " ");
		}
	}
	
	public static int recurr(int x) {
		if (x <= 0) {
			return 0;
		} else if (x == 1){
			return 1;
		}
		
		return recurr(x - 1) + recurr(x - 2);
	}
}
