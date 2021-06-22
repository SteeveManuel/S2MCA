// Program to generate fibonacci series using while loop.

import java.util.*;
public class Main{
public static void main(String[] args){

int max = 10, prev = 0, next = 1;
System.out.print("Fibonacci Series of "+ max +" numbers : ");
int i=1;
while(i <= max)
{
	System.out.print(prev+ " ");
	int sum = prev + next;
	prev = next;
	next = sum;
	i++;
}
	



}
}
