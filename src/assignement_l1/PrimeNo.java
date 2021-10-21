package assignement_l1;

import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		int p;
		for(int i=2;i<n;i++) {
			p=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					p=1;
			}
			if(p==0)
				System.out.println(i);
		}
		
	}

}

