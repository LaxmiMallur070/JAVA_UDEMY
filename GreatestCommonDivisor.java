/******************************
Description:
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second. If one of the parameters is < 10, the method should return -1 to indicate an invalid value. The method should return the greatest common divisor of the two numbers (int). The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
********************************/

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25,15));

	}

	public static int getGreatestCommonDivisor(int num1, int num2) {
		if(num1>10 && num2>10) {
			int temp=num1>num2?num1:num2;
			
			temp=temp/2;
			System.out.println(temp);
			for(int i=temp;i<=temp;i--) {
				if((num1%i==0) && (num2%i==0)) {
					return i;
				}
			}
		
		}
		return -1;
	}

}
