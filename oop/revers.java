// Program to print the reverse of the inputted number

import java.util.*;
public class Main
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number  : ");
		int num =  in.nextInt();
		System.out.println("Reversed number : " + reverse(num));
	}
	public static int reverse(int num)
	{	 
		int rev = 0, rem = 0;
		while (num > 0)
		{
			rem = num % 10;
			rev = ( rev * 10) + rem;
			num = num / 10;
		}
		return rev;
		
		
	}
}