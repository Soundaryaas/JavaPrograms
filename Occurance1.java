package java.day1;

public class Occurance1 {

	public static void main(String[] args) {

		int count = 0;
		String s= "You have no choice other than following me!";
		char a[] = s.toCharArray();
		for(int i = 0; i < s.length(); i++)
		{
			if(a[i] =='o') {

				count = count+1;
			}
		}
		System.out.println("Number of Occurrence of the Element:"+count); 
	}

}
