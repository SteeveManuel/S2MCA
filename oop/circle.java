//Program to print the area and perimeter of circle

import java.util.*;
public class Main{
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter radius of a circle : ");
	double rad = input.nextDouble();
	System.out.println("Area      = " + (Math.PI * rad * rad ));
	System.out.println("Perimeter = " + (2 * Math.PI * rad));
}
}