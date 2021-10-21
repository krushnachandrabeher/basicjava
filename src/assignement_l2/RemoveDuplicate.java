package assignement_l2;
import java.util.Scanner;
public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" element");
		//n=removeDuplicates(a[i],n);
		for(int i=0;i<n;i++) {
			
		}
			//System.out.println(a[i]+" ");
		
	}
	public static int removeDuplicates(int a[], int n) {
		if(n==0||n==1) {
			return n;
		}
		int []temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j+1]=a[i];
			}
		}
		temp[j++]=a[n-1];
		for(int i=0;i<j;i++) {
			a[i]=temp[i];
		}
		return j;
	}


}
