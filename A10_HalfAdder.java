/*10. Implement a JAVA program to implement a Half adder using Bitwise operator.*/


class A10_HalfAdder{
	public static void main(String args[]){
		int a = 0;
		int b = 1;
		int sum = a ^ b;
		int cout = a & b;
		System.out.println("sum is : "+sum);
		System.out.println("carry is : "+cout);
	}
}