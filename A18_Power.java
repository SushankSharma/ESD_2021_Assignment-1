/*18. Find the power of the number without using existing methods. */

class A18_Power{
	public static void main(String args[]){
		int power = 2;
		int base = 3; //[3^2]
		int temp = base;
		while(power > 1){
			temp = temp * base;
			System.out.println(temp);
			power--;
		}
		System.out.println("Ans : " + temp);
	}
}