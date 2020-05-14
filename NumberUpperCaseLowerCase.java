package day2;

//3. Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
//Input: "1. It is Work from Home  not Work for Home"
//- Character class
//- ascii
//- regex


public class NumberUpperCaseLowerCase {

	public static void main(String[] args) {

		String input="1. It is Work from Home  not Work for Home";
		int uppercase = 0,lowercase = 0,space=0,numbers=0;
		char[] charArray= input.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(Character.isUpperCase(charArray[i])) {
				uppercase+=1;
			}
			else if(Character.isLowerCase(charArray[i])) {
				lowercase+=1;
			}
			else if(Character.isDigit(charArray[i])) {
				numbers+=1;
			}
			else if(Character.isSpaceChar(charArray[i]))
				space+=1;
			
		}
		System.out.println("The number of UpperCase: "+ uppercase);
		System.out.println("The number of Lowercase:"+lowercase);
		System.out.println("The number of Digits:"+numbers);
		System.out.println("The number of Spaces:"+space);

	}

}
