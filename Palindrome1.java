package java.day1;

import java.util.Arrays;

public class Palindrome1 {

	public static void main(String[] args)
	{
		//Approach #1
		String s  = "testleaf";
		char[] myArray = s.toCharArray();
		int size = myArray.length;
		char [] original = Arrays.copyOf(myArray,myArray.length);

		for (int i = 0; i < size / 2; i++) {
			char temp = myArray[i];
			myArray[i] = myArray[size-i-1];
			myArray[size-i-1] = temp;
		}


		if(Arrays.equals(myArray, original)) {
			System.out.println("Entered string is a palindrome"); 
		} else {
			System.out.println("Entered string is not a palindrome");
		}
	}



}


