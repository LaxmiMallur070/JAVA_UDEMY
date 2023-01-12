/******************
Description:
Write a method called inputThenPrintSumAndAverage that does not have any parameters.The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
XX represents the sum of all entered numbers of type int.
YY represents the calculated average of all numbers of type long.
Example: INPUT:

1
2
3
4
5
a
OUTPUT

SUM = 15 AVG = 3

********************/

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();

	}

	public static void inputThenPrintSumAndAverage() {
		int sum = 0;
		double average = 0;
		Scanner scan = new Scanner(System.in);
		double count = 0;
		while (true) {

//	            System.out.println("Enter number:");
			boolean isAnInt = scan.hasNextInt();

			if (isAnInt) {

				int number = scan.nextInt();
				sum = sum + number;
				count++;

			} else {
				break;
			}
			
			scan.nextLine(); // handle input
		}
		average = sum / count;
		System.out.println(sum + " " + count);
		System.out.println(average);
		int avg = (int) Math.round(average);
		System.out.println("SUM = " + sum + " AVG = " + avg);
	}

}
