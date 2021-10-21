package assignement_l1;
import java.util.Scanner;
public class SumOfNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int sum=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0||i%5==0) {
				sum=sum+i;
				System.out.println(i+" ");
			}
		}
		System.out.println(sum);
	}

}
