import java.util.*;
import java.lang.*;

/*
 * Tony Vu
 * Created: 17/12/2018
 * Recreates the Mocking Spongebob Meme, where every other letter is capitalized
 */
public class MockMeme {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String result = "";
		System.out.print("Enter the string to mock: ");
		String mock = input.nextLine();
		
		for (int i = 0; i < mock.length(); i++) {
			if ((i - 1) % 2 == 0) {
				result += Character.toUpperCase(mock.charAt(i));
			} else {
				result += Character.toLowerCase(mock.charAt(i));
			}
		}
		
		System.out.println(result);
	}
}
