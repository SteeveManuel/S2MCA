// Program to generate 10 fibonacci series.

import java.util.*;
public class Main{
public static void main(String[] args){

int max = 10;
int prev =0;
int next =1;

System.out.print("Fibinacci series of "+ max +" numbers:");

for (int i=1; i<= max;i++)
{
	System.out.print(prev + " ");
	int sum = prev + next;
	prev = next;
	next = sum;
}


}
}
