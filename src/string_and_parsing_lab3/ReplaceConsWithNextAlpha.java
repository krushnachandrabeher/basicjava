package string_and_parsing_lab3;
import java.util.Scanner;
public class ReplaceConsWithNextAlpha {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence :-");
		String str=sc.nextLine();
		System.out.println(replaceConsonants(str.toCharArray()));
		
	}
	static boolean isVowel(char ch) {
		if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='u'&&ch!='o') {
			return false;
		}
		return true;
	}
	static String replaceConsonants(char[] str) {
		for(int i=0;i<str.length;i++) {
			if(!isVowel(str[i])) {
				if(str[i]=='z') {
					str[i]='b';
				}
				else {
					str[i]=(char)(str[i]+1);
					if(isVowel(str[i])) {
						str[i]=(char)(str[i]+1);
					}
				}
			}
		}
		return String.valueOf(str);
	}
}
