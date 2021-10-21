package assignement_l1;

import java.util.Scanner;
public class SquareDiff {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(Square_Diff(n));
		
	}
	static int Square_Diff(int n) {
		int l,k,m;
		l=(n*(n+1)*(2*n+1))/6;
		k=(n*(n+1))/2;
		k=k*k;
		m=k-l;
		return m;
	}

}

