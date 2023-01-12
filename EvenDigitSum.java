/**********Leap year calculator********
Description:
Write a method named getEvenDigitSum with one parameter of type int called number. The method should return the sum of the even digits within the number. If the number is negative, the method should return -1 to indicate an invalid value.
Example: getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
*************************************/
public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(0));

	}

	public static int getEvenDigitSum(int number) {
		int sum=0;
		if(number>=0) {
			while(number>0) {
				int rem=number%10;
				number=number/10;
				if(rem%2==0) {
					sum= sum+rem;
				}
			}
			return sum;
		}
		return -1;
	}

}
