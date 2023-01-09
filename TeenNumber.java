/**********Barking dog********
Description:

1st method: We'll say that a number is "teen" if it is in the range 13 -19 (inclusive). Write a method named hasTeen with 3 parameters of type int. The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
Example: hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
	     hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19

2nd method: Write another method named isTeen with 1 parameter of type int. The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
Example: isTeen(9);  should return false since 9 is in not range 13 - 19
		 isTeen(13);  should return true since 13 is in range 13 - 19
******************************/
public class TeenNumber {

	public static void main(String[] args) {
		boolean result = hasTeen(23, 15, 42);
		System.out.println(result);
		boolean result1= isteen(13);
		System.out.println(result1);

	}

	private static boolean isteen(int i) {
		if((i>=13 && i<=19)) {
			return true;
		}
		return false;
	}

	private static boolean hasTeen(int i, int j, int k) {
		if((i>=13 && i<=19) || (j>=13 && j<=19) || (k>=13 && k<=19))
		{
			return true;
		}
		return false;
	}

}
