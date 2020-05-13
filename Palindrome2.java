package java.day1;

public class Palindrome2 {

	public static void main(String[] args)
	{
		//Approach #2
	
	      String original, reverse = "";          
	      original = "testleaf";
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	      {
	    	  reverse = reverse + original.charAt(i);
	      }
	      if (original.equals(reverse)) 
	      {
	         System.out.println("Entered number is a palindrome.");}  
	      else  {
	         System.out.println("Entered string/number isn't a palindrome.");}   
	

}
}