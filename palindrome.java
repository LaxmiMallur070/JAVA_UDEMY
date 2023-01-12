/**********Leap year calculator********
Description:
Write a method called isPalindrome with one int parameter called number. The method needs to return a boolean. It should return true if the number is a palindrome number otherwise it should return false. 
Example: isPalindrome(-1221); → should return true
		 isPalindrome(707); → should return true
************************************/
public class palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-222));
		
	}

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		
		number = Math.abs(number);
		int lastdigit = number;

		while (number > 0) {

			int rem = number % 10;
			number = number / 10;
			reverse = (reverse * 10)+rem;

		}
		if (reverse == lastdigit) {
			return true;
		} else
			return false;
	}

}
