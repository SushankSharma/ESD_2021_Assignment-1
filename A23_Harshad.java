/*23. Implement a Java program to check whether a number is a Harshad Number or not.*/

class A23_Harshad{
	public static void main(String args[]){
		int num = 22; //22 = 22/2+2 = [~H] for 21 = 21/2+1 [H]
		int temp = num;
		int sum = 0;
		int digit;
		while(num > 0){
			digit = num % 10;
			num = num / 10;
			sum = sum + digit;
		}
		if((temp % sum) == 0){
			System.out.println("Harshad number");
		}
		else{
			System.out.println("Not a Harshad number");
		}
	}
}


