package oops_lab4;
public class Account {
	//declairing given variable
	private static long accNo=1000;
	static double minBal=500;
	private double balance;
	private String accHolder;
	Person p;
	
	public Account() {
		
	}
	
	//constructor
	public Account(Person p) {
		this.p=p;
		
	}
	
	//getter & setters
	public static long getAccNum() {
		return accNo;
	}

	public static void setAccNum(long accNum) {
		Account.accNo = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person p) {
		this.accHolder = p.getName();
	}
	
	//toString method
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accHolder=" + accHolder + ", p=" + p + "]";
	}
	
	
	//logic for deposit
	public void deposit(double depAmount) {
		if(depAmount>0) {
			this.balance+= depAmount;
			System.out.println("Your total balance is: "+this.balance);
		}
	}
	
	
	//declaring the withdraw method for future purpose
	public void withdraw(double withAmount) {
		 
	}
	
}
