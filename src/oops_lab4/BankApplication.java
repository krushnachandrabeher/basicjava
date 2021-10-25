package oops_lab4;

public class BankApplication {

	public static void main(String[] args) {
		Person p1= new Person("smith", 24);
		Person p2= new Person("Kathy", 23);
		
		SavingAccount s1= new SavingAccount();
		CurrentAccount c1= new CurrentAccount();
		
		s1.createAccount(p1,2000);
		c1.createAccount(p2, 3000);
		
		System.out.println(s1.balance);
		System.out.println(c1.balance);
	}

}
