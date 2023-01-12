/**********Leap year calculator********
Description:
Write a method named hasSharedDigit with two parameters of type int. Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false. The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
Example: hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
*****************************************/

public class SharedDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 13));

	}

	public static boolean hasSharedDigit(int i, int k) {
		if((i>=10 && i<=99 ) && (k>=10 && k<=99)) {
			while(i>0) {
				int rem1=i%10;
				int j=k;
				while(j>0) {
					int rem2=j%10;
					j=j/10;
					if(rem1==rem2) {
						return true;
					}
					
				}
				i=i/10;
				
				
			}
		}
		return false;
	}

}
