package assignement_l1;

import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the type of light");
		String st = sc.next();
		sc.close();
		switch (st) {
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("ready");
			break;
		case "green":
			System.out.println("go");
			break;
		default:
			System.out.println("");

	}
	}

}


