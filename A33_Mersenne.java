/*33. Implement a program to check if a number is Mersenne number or not.*/

import java.lang.Math;

class A33_Mersenne{
	public static void main(String args[]){
		int num = 31;
		double temp = Math.log(num + 1)/Math.log(2); //For n=2,...., 2^n-1 = [Should be a Prime No.]
		//System.out.println(temp);
		if( temp == (int) temp ){
			System.out.println("Mersenne number");
		}
	}
}