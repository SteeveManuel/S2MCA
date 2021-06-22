//Program to take two number as input and display the product of two numbers

import java.util.*;
public class Main{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	System.out.print("Input the first number : ");
	int num1 = input.nextInt();
	System.out.print("Input the second number : ");
	int num2 = input.nextInt();
	System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
}
}