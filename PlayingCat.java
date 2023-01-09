/**********Playing cat********
Description:
The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35. Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
1st parameter should be of type boolean and be named summer it represents if it is summer.
2nd parameter represents the temperature and is of type int with the name temperature.
Example: isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45 
		 isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)

******************************/
public class PlayingCat {

	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 15));

	}

	
public static boolean isCatPlaying(boolean summer, int temperature) {
// 		if(summer)
// 		{
// 			if((temperature>=25) && (temperature<=45)) {
// 				return true;
// 			}
// 			else 
// 				return false;
// 		}
		
// 			if((temperature>=25) && (temperature<=35)) {
// 				return true;
// 			}
		
// 		return false;
	 return ((temperature >= 25 && temperature <=35) || (temperature >= 25 && temperature <=45 && summer));	
	}


}
