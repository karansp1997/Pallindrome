package pallindrome;

import java.util.Scanner;

public class Pallindrome_UserInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original;
		String reverse=" ";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String to chck whether pallindrome or not");		
		original = in.nextLine();
		
		int length = original.length();
				 
	      for ( int i = length - 1; i >= 0; i-- )
	      {
	         reverse = reverse + original.charAt(i);
	         System.out.println(reverse);
	      }
	 
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string isn't a palindrome.");

	}

}
