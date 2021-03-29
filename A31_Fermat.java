/*31. Implement a Java program to display first 10 Fermat numbers.*/

import java.lang.Math;

class A31_Fermat{
	public static void main(String args[]){
		int i;
		double num;
	
		for( i = 0; i < 10; i++){
			num = Math.pow(2, Math.pow(2, i)) + 1.0; //F0:[2^2^0 + 1] = 3, F1:[2^2^1 + 1] = 5....
			System.out.println(num);
		}
	}
	
}