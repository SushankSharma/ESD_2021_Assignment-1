/*28. Implement a Java program to check if a given number is circular prime or not.*/

class A28_CirculatPrime{
	static boolean isPrime(int num){
		int i;
		for(i = 2; i < num; i++){
			if((num % i) == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		int num = 1193; // The other number in this combination corresponding to 1931,9311,3119 are all prime
		int length = String.valueOf(num).length();
		int mask = 1, i;
		int digit;
		for( i = 0; i < length - 1 ; i++){
			mask = mask * 10;
		}
		//System.out.println(mask);
		for(i = 0; i < length; i++){
			digit = num % 10;
			num = num / 10;
			//System.out.println(digit);
			num = (digit * mask) + num;
			//System.out.println(num);
			if(!(isPrime(num))){
				System.out.println("Number is not circular prime");
				return;
			}
		}
		System.out.println("Number is circular prime");
	}
}