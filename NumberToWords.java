
public class NumberToWords {

	public static void main(String[] args) {
		numberToWords(0);
		

	}

	public static void numberToWords(int number) {
		
			int count=getDigitCount(number);
			System.out.println(count);
			number=reverse(number);
//			System.out.println(number);
			if(number>=0) {
				while(count>0) {
					int rem=number%10;
					switch(rem) {
					case 0: System.out.print("Zero ");
					break;
					case 1: System.out.print("One ");
					break;
					case 2: System.out.print("Two ");
					break;
					case 3: System.out.print("Three ");
					break;
					case 4: System.out.print("Four ");
					break;
					case 5: System.out.print("Five ");
					break;
					case 6: System.out.print("Six ");
					break;
					case 7: System.out.print("Seven ");
					break;
					case 8: System.out.print("Eight ");
					break;
					default: System.out.print("Nine ");
					break;
					
					}
					number=number/10;
				count--;
				
				}	
			}
			else {
				System.out.println("Invalid Value ");
			}
			
		
		
	}

	public static int getDigitCount(int number) {
		if(number<0)
			return -1;
		if(number/10==0)
			return 1;
		return 1+getDigitCount(number/10);
		
	}

	public static int reverse(int number) {
		
		int rev=0;
		
		while(number!=0) {
			int rem = number % 10;
			number = number / 10;
			rev = (rev * 10)+rem;
		}
		
		
		return rev;
		
		
		
	}

}
