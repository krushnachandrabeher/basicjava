package flowcontrol_lab1;

import java.util.Scanner;
public class IncreasingNo_Ex7 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to check for increasing number: ");
		int number = sc.nextInt();

		// invoking of method
		if (checkNumber(number))
			System.out.println("Number is an increasing number.");
		else {
			System.out.println("Number is not an increasing number.");
		}


	}

	// method to check a number is in increasing order
	static boolean checkNumber(int number) {

		int lastDigit = number % 10;
		number /= 10;
		boolean flag = false;

		while (number > 0) {
			if (lastDigit <= number % 10) {
				flag = true;
				break;
			}

			lastDigit = number % 10;
			number /= 10;

		}
		if (flag)
			return false;
		else {
			return true;
		}

	}
}

