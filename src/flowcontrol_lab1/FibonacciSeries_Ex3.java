package flowcontrol_lab1;
import java.util.Scanner;
public class FibonacciSeries_Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Asking for user input
		System.out.println("Enter the term: ");
		int n = sc.nextInt();
		// logic to display the result by calling the method.
		if (fibbo(n) == 0)
			System.out.println("Invalid input");
		else {
			System.out.println(fibbo(n));
		}
		// Closing the costly resource
		sc.close();
	}
	// Non-recursive method to find the fibonacci series
	public static int fibbo(int n) {
		int a = 1, b = 1, c;
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return a;
		for (int i = 3; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
}
