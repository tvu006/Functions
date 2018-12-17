import java.util.*;

/*
 * Tony Vu
 * Created: 16/12/2018
 * Converts a given positive integer to its binary number
 * Does not do negative or decimal numbers
 */
public class BinaryConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a number to convert to binary: ");	
		System.out.println(convertToBinary(input.nextInt()));
	}
	
	public static int convertToBinary(int n) {
		int remaining = n;
		String result = "";
		while (remaining != 0) {
			if (remaining % 2 == 0) {
				remaining = remaining / 2;
				result += "0";
			}else {
				remaining = remaining / 2;
				result += "1";
			}
		}
		int binary = Integer.parseInt(reverseString(result));
		return binary;
	}
	
	public static String reverseString(String word) {
		String reversed = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		return reversed;
	}
}
