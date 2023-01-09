/**********Equality printer********
Description:

Write a method printEqual with 3 parameters of type int. The method should not return anything (void). If one of the parameters is less than 0, print text "Invalid Value". If all numbers are equal print text "All numbers are equal" If all numbers are different print text "All numbers are different". Otherwise, print "Neither all are equal or different".
Example: printEqual(1, 1, 1); should print text All numbers are equal
		 printEqual(1, 1, 2); should print text Neither all are equal or different
		 printEqual(-1, -1, -1); should print text Invalid Value
		 printEqual(1, 2, 3); should print text All numbers are different
******************************/
public class EqualityPrinter {

	public static void main(String[] args) {
		printEqual(2, 1, 1);

	}

	public static void printEqual(int i, int j, int k) {
		if((i<0) || (j<0) || (k<0)) {
			System.out.println("Invalid Value");
		}
		else if((i==j) && (j==k))
		{
				System.out.println("All numbers are equal");
		}
		else if((i==j) || (i==k) || (j==k))
		{
			System.out.println("Neither all are equal or different");
		}
		else
			System.out.println("All numbers are different");
		
	}

}
