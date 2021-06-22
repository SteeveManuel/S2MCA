// Program of check whether a string is Palindrome or not

import java.util.*;
public class Main
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string  : ");
		String str =  in.nextLine();
		System.out.println(str + palindrome(str));
	}
	public static String palindrome(String str)
	{
		
		String rev = "";
		for(int i = (str.length()-1) ; i >= 0; i--)
		{
			rev = rev + str.charAt(i);	
		}
		if (rev.equalsIgnoreCase(str))
			return(" is palindrome");
		else
			return(" is not palindrome");
	}
}