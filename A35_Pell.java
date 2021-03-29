/*35. Implement a Java program to print the first 15 numbers of the Pell series. */

class A35_Pell{
	public static void main(String args[]){
		int num1 = 0;
		int num2 = 1;
		int num3;
		int i;
		System.out.println(num1);
		System.out.println(num2);
		for( i = 0; i < 13; i++){
			num3 = (2 * num2) + num1;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}
}