package assignement_l2;
import java.util.Scanner;
public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+"element");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int min;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ar[i]>ar[j]) {
					min=ar[i];
					ar[i]=ar[j];
					ar[j]=ar[i];
				}
			}
		}
		System.out.println("the second smallest element is :- "+ar[1]);
	}
	



}
