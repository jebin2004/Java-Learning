// Find out duplicate number between 1 to N numbers
package realExample;

import java.util.Arrays;

public class Duplicate {
	public static void main(String args[]) {

		int[] input = { 1, 5, 23, 5, 23, 2, 1, 6, 12, 3, 1, 8, 12, 3, 23 };

		Arrays.sort(input);

		for (int i = 1; i < input.length; i++) {
			if (input[i] == input[i - 1]) {
				System.out.println("Duplicate" + input[i]);
			}
		}
	}
}
