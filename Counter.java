import java.util.*;

/*
 * Tony Vu
 * 14/12/2018
 * Program prints numbers from a given starting point, in the given multiple to the given ending
 */
public class Counter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number to start counting at: ");
		double start = input.nextDouble();
		System.out.print("Enter the number to end counting at: ");
		double end = input.nextDouble();
		System.out.print("Enter the number to count by: ");
		double counter = input.nextDouble();
		
		printCounter(start, end, counter);
	}
	
	public static void printCounter(double start, double end, double counter) {
		if (counter == 0) System.out.println("Invalid counter.");
		if ((counter < 0 && end > start) || (counter > 0 && end < start)) System.out.println("Invalid input.");
		
		if (counter > 0) {
			for (double i = start; i <= end; i += counter) {
				System.out.printf("%.2f \n", i);
			}
		}else {
			for (double i = start; i >= end; i += counter) {
				System.out.printf("%.2f \n", i);
			}
		}
	}
}
