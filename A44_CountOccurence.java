/*44. Implement a java program to count the repeated occurence of a digit in a n-digit number.*/

class A44_CountOccurence{
	public static void main(String args[]){
		int num = 14285567;
		int checkDigit = 5;
		int count = 0;
		int digit;
		while(num > 0){
			digit = num % 10;
			if(checkDigit == digit){
				count++;
			}		
			num = num / 10;
		}
		System.out.println("count of "+checkDigit+" : "+count);
	}
}