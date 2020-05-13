package java.day1;

public class Occurance2 {

	public static void main(String[] args) {
		//using regular expression
		String s= "You have no choice other than following me!";
		String rep = s.replaceAll("[^o]","");
		System.out.println("Number of Occurrence of the Element: "+rep.length()); 
	}

}
