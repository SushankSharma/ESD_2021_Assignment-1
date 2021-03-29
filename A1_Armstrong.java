/*1. Implement JAVA program to check whether a given number is ARMSTRONG or not. (3 digit)*/


import java.lang.Math;

class A1_Armstrong{
	
	static boolean isNarcissistic(int num){
		int length = String.valueOf(num).length();
		int i, sum = 0, digit;
		int temp = num;
		while(num > 0){
			digit = num % 10;
			num = num /10;
			sum = sum + (int)Math.pow(digit, length);
		}
		if(sum == temp){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String args[]){
		int i = 153;
		if(isNarcissistic(i)){
			System.out.println("Number is Armstrong");
		}
		
		else{
			System.out.println("Number is not Armstrong");
		}
	
	}
}
