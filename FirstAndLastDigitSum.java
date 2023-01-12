/**********Leap year calculator********
Description:
Write a method named sumFirstAndLastDigit with one parameter of type int called number. The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.If the number is negative then the method needs to return -1 to indicate an invalid value.
Example: sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.

**************************************/
public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(2));

	}

	public static int sumFirstAndLastDigit(int number) {
		int sum=0;
		int firstdigit=0;
		int lastdigit=0;
		if(number>=0){
			if(number<10){
				return number+number;
			}
			firstdigit=number%10;
			while(number>0) {
				lastdigit=number%10;
				number=number/10;
				
			}
			sum = firstdigit+lastdigit;
			return sum;
		}
		
		return -1;
	}

}
