/**********Leap year calculator********
Description:
Write a method named printFactors with one parameter of type int named number.If number is < 1, the method should print "Invalid Value". The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).
Example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.
***************************************/
public class AllFactors {

	public static void main(String[] args) {
		printFactors(32);

	}

	public static void printFactors(int number) {
		if(number>0) {
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					System.out.println(i);
				}
					
			}	
		}
		else {
			System.out.println("Invalid Value");
		}
	
		
	}

}
