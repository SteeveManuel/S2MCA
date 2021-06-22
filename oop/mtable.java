//Program to take a number as input and print its multiplication table upto 10 

import java.util.*;
public class Main{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = input.nextInt();
	for(int i=1;i<11;i++)
	{
		System.out.println(i+" x "+num+" = "+(i*num));
	}
}
}