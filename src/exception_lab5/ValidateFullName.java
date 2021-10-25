package exception_lab5;
import java.util.Scanner;
public class ValidateFullName extends Exception{
	//this method extends the exception class
		public ValidateFullName() {  // no-arg constructor
			super("full name of the employee");
		}
		//main method
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);//read input from user
			System.out.print("First name : ");
			String fn = sc.nextLine();   //store input in fn variable
			System.out.print("Last name : ");
			String ln = sc.nextLine();    //store input in ln variable
			try {  // here we write which codes may occur exception
				if (fn.isEmpty() || ln.isEmpty()) {
					throw new ValidateFullName();
				}
			} catch (ValidateFullName vn) {   // it handle the exception
				System.err.println("firstName and lastName can not be blank");
			} finally {  // it must execute whether exception is handle or not
				System.out.println("Your name is : " + fn + " " + ln);
			}

		}
}
