/**********Leap year calculator********
Description:
Write a method named hasSameLastDigit with three parameters of type int. Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false. The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
Example: hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
***************************************/
public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));

	}

	private static boolean hasSameLastDigit(int i, int j, int k) {
		
		if(isValid(i) && isValid(j) && isValid(k)) {
			
			if((i%10==j%10 || i%10==k%10 || j%10==k%10)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isValid(int number) {
		if(number>=10 && number<=1000)
			return true;
	return false;	
	}

}
