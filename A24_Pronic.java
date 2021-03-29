/*24. Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not.*/

class A24_Pronic{
	public static void main(String args[]){
		int num = 30; // n*[n+1]= for n=0 [0], |||ly n=1 [2], 6,12,20,30,42....
		int i;
		for( i = 1; i < num; i++){
			if((num % i) == 0){
				if((num % (i + 1))== 0){
					System.out.println("Number is pronic");
					return;
				}
			}
		}
		System.out.println("Number is not pronic");
	}
}