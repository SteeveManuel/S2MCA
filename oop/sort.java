//Program to sort a numeric array and a string array

import java.util.*;
public class Main{

public static void main(String[] args) {
	int[] my_array1 = {101,234,111,555,107,234,227,869,367};
	String[] my_array2 = {"java", "python", "PHP", "C#", "C", "C++ "};
	
	System.out.println("Original numeric array : "+ Arrays.toString(my_array1)) ;
	Arrays.sort(my_array1);
	System.out.println("Sorted numeric array : "+ Arrays.toString(my_array1));
	System.out.println("Original string array : "+ Arrays.toString(my_array2));
	Arrays.sort(my_array2);
	System.out.println("Sorted string array : "+ Arrays.toString(my_array2));
	}

}

