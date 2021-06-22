//Program to print 'Hello on screen and then print your name on a seperate line.

import java.util.*;
public class Main{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	System.out.print("Input your first name: ");
	String fname = input.next();
	System.out.print("Input your last name: ");
	String lname = input.next();
	System.out.println();
	System.out.println("Hello \n"+fname+" "+lname);
}
}