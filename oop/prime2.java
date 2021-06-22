//Program to check number is prime or not

import java.util.*;
public class Main{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);


        	System.out.println("Input a range to print Prime numbers : ");
       
 	int start = scan.nextInt();
	int end = scan.nextInt();
	
	for(int j = start; j <= end; j++)
	{
	   	int np = 0;

	 	for(int i = 2; i <= j /2 ; i++)
        
			 if(j % i == 0)
            
			{
                
				np = 1;
				break;
			}
        
		if (np == 0)
        
		
            	System.out.print(j +" " );
        
	}
      
}
}