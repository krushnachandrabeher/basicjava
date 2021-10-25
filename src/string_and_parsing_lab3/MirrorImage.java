package string_and_parsing_lab3;
import java.util.Scanner;
public class MirrorImage {
	//method where write the business logic
		public static String getImage(String s) {
	                String str ="";
	                char ch;
	                int i = 0;
	                while(i<s.length()) //length() return the length of the string
	                {
	                  ch = s.charAt(i); //charAt() return the character at a specified index in a string
	                  str = ch + str;
	                  i++;
	                }
	                 s += "|" + str;
	                 return s;   //return statement
	                 
		}
		
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter your word here :");
	        String s = sc.nextLine();  // to read the user iput.
	        //StringBuilder s1 = new StringBuilder(s);

	        System.out.println(getImage(s)); //calling getImage method
	     }
}
