// Program to generate fibonacci series based on the user input.

import java.util.*;
public class Main{
public static void main(String[] args){

int max = 0, prev = 0, next =1;
System.out.print("How many number you want in Fibonacci:");
Scanner scan = new Scanner(System.in);
max = scan.nextInt();
System.out.print("Fibonacci Series of "+ max + " numbers : ");
for( int i =1; i<=max; i++)
{
	System.out.print( prev + " ");
	int sum = prev + next;
	prev = next;
	next = sum; 
}


}
}
