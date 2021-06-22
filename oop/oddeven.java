//Program to Check a number is odd or even

import java.util.*;
public class Main{
public static void main(String[] args)
{
	
	Scanner input = new Scanner(System.in);
    
	System.out.print("Input a  number:");

	int num = input.nextInt();
	if ( num % 2 == 0 )
        
		System.out.println(num + " is even");
     
	else
        
		System.out.println(num + " is odd");
  

}
}