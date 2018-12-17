import java.util.*;

/*
 * Tony Vu\
 * Created: 16/12/2018
 * Converts a given positive integer to the hexadecimal number
 * Does not do negative or decimal numbers
 */
public class HexConverter extends BinaryConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number to be converted to hexadecimal: ");
		System.out.println(convertToHex(input.nextInt()));
	}
	
	public static String convertToHex(int n) {
		if (n <= 0) {
			System.out.println("Invalid input.");
			System.exit(1);
		}
		String result = "";
		
		for (int i = 10; i >= 0; i--) {
			if (n > Math.pow(16, i)) {
				int x = n / (int) Math.pow(16, i);
				n = n - (int) (x * Math.pow(16, i));
				switch (x) {
					case 10: result += "A"; break;
					case 11: result += "B"; break;
					case 12: result += "C"; break;
					case 13: result += "D"; break;
					case 14: result += "E"; break;
					case 15: result += "F"; break;
					default: result += x; break;
				}
			} else {
				if (result.length() != 0) {
					result += 0;
				}
			}
		}
		
		return result;
	}
}
