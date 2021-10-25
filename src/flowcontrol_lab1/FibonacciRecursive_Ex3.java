package flowcontrol_lab1;
import java.util.Scanner;
public class FibonacciRecursive_Ex3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Ask for user input
		System.out.println("Enter a number to find the number from fibonacci series: ");
		int n = sc.nextInt();

		// logic to display the result by calling the method.
		if (fibbo(n) == 0)
			System.out.println("Invalid input.");
		else {
			System.out.println(fibbo(n));
		}

	}

	// Recursive method to find the fibonacci series
	public static int fibbo(int n) {
		if (n == 0)
			return 0;
		if (n <= 2)
			return 1;
		return fibbo(n - 1) + fibbo(n - 2);
	}
}
