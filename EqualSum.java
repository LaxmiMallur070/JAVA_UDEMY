/**********Barking dog********
Description:
Write a method hasEqualSum with 3 parameters of type int. The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
Example:hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
        hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
******************************/
public class EqualSum {

	public static void main(String[] args) {
		boolean result = hasEqualSum ( 1, -1, 0);
		System.out.println(result);

	}

	private static boolean hasEqualSum(int i, int j, int k) {
		if((i+j)==k)
		{
			return true;
		}
		return false;
	}

}
