//Program to check number is prime or not

import java.util.*;
public class Main{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);


        	System.out.print("Input a Number : ");
       
 	int num = scan.nextInt();
	int np = 0;

	if ( num == 0 || num == 1 )
		System.out.print(num + " is not prime ");

	else
	{     
	 	for(int i = 2; i <= num/2 ; i++)
        
		{
           
			 if(num % i == 0)
            
			{
                
				System.out.print(num + " is not prime ");
  
				np = 1;
				break;
            
			}
        
		}

       
		if (np == 0)
        
		
            System.out.print(num + " is prime");
        
	}
      
}
}