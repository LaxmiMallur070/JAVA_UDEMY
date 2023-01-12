/******************
Description:
Write a method named printSquareStar with one parameter of type int named number. If number is < 5, the method should print "Invalid Value".
The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
printSquareStar(5); should print the following:

→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy

*****
** **
* * *
** **
*****

****************************/
public class DiagonalStart {

	

	public static void main(String[] args) {
		printSquareStar(8);

	}

	public static void printSquareStar(int number) {
		int i, j;
		if(number<5)
			System.out.println("Invalid value");
		else {
			for (i = 1; i <= number; i++) {
				for (j = 1; j <= number; j++) {
					if(i==1 || j==i || j==1 || j==number-i+1 || j==number || i==number) {
						System.out.print("*");
					}
					else if(j!=i)
						System.out.print(" ");	
					
				}
				System.out.println("");
			}
		}
		
	}

}
