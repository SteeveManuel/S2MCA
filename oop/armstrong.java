//  Program to check whether a number is armstrong or not

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number : ");
		int num = in.nextInt();
		System.out.println(num + armstrong(num));
	}

	public static String armstrong (int num)
	{
		int copy = num, sum = 0, rem = 0, digit =0;
		while (copy != 0)
		{  
			copy = copy/10;
			digit++;
		}
		copy = num;
		while (copy != 0)
		{
			rem  = copy % 10;
			copy = copy /10 ;
			sum += Math.pow(rem,digit);
		}
		if (num == sum)
			return(" is Armstrong");
		else
			return(" is not Armstrong");
	}
}