import java.util.Scanner;

/*
 * Tony Vu\
 * Created: 16/12/2018
 * Converts a given positive integer to a given base number
 * Does not do negative or decimal numbers
 */
public class XConverter extends BinaryConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the base for a number to be converted to (0 < base < 10): ");
		int base = input.nextInt();
		System.out.print("Enter the number to be converted to hexadecimal (num > 0): ");
		int num = input.nextInt();
		System.out.println(convert(base, num));
	}
	
	public static String convert(int base, int n) {
		if (base > 10 || base < 1 || n <= 0) {
			System.out.println("Invalid input.");
			System.exit(1);
		}
		String result = "";
		
		for (int i = 10; i >= 0; i--) {
			if (n >= Math.pow(base, i)) {
				int x = n / (int) Math.pow(base, i);
				n = n - (int) (x * Math.pow(base, i));
				result += x;
			} else {
				if (result.length() != 0) {
					result += 0;
				}
			}
		}
		
		return result;
	}
}
