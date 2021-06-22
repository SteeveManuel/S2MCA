//Program to Swap 2 number using 3rd variable

import java.util.*;
public class Main{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	System.out.print("Input a number for A : ");
	int a = input.nextInt();
	System.out.print("Input a number for B : ");
	int b = input.nextInt();
	int c = a;
	a = b;
	b = c;
	System.out.println("Number in A : "+ a );
	System.out.println("Number in B : "+ b );
}
}