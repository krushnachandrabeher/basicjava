package flowcontrol_lab1;
import java.util.Scanner;
public class SumOfNo_Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Asking for user input
		System.out.println("Enter a number to find natural numbers: ");
		int n = sc.nextInt();
		System.out.println("Sum of natural numbers is: " + calculateSum(n));
	}
	// Method for Calculate Sum of natural numbers.
	static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum = sum + i;
		}
		return sum;
	}

}
