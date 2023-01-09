/**********Decimal comparator********
Description:

Write a method areEqualByThreeDecimalPlaces with two parameters of type double. The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
Example: areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
	     areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
******************************/

public class BarkingDog {

	public static void main(String[] args) {
		
		System.out.println(areEqualByThreeDecimalPlaces(3.123, 3.123);
	
	}

	  public static boolean areEqualByThreeDecimalPlaces(double a, double b)
    {
        a=(int)(a*1000);
        b=(int)(b*1000);
        return (a==b)? true:false;
    }

}
