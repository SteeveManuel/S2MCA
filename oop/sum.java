//Program to print 'Hello on screen and then print your name on a seperate line.

import java.util.*;
public class Main{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	System.out.print("Input the first number : ");
	int num1 = input.nextInt();
	System.out.print("Input the second number : ");
	int num2 = input.nextInt();
	int sum = num1 + num2;
	System.out.println();
	System.out.println("Sum : "+sum);
}
}