package arrays_lab2;
import java.util.Arrays;
public class StringSort_Ex2 {
	public static void main(String[] args) {

		String[] stringArray = { "ab", "Ba", "c", "Sub", "2", "1Ad", "a10" };

		// Invoking the method
		sortString(stringArray);

	}

	// method to sort the string in alphabetical order.
	public static void sortString(String[] sArr) {
		Arrays.sort(sArr);
		System.out.println(Arrays.toString(sArr));
	}
}
