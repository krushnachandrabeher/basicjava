package assignement_l1;

import java.util.Scanner;
public class Cubes_Sum {
	static int cubeSum(int n) {
		int sum=0;
		do {
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}while(n!=0);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int s=cubeSum(n);
		System.out.println("the sum of cube of digit is :- "+s);
	}

}

