/*8. Implement a JAVA program to find the odd numbers between 0-100.*/

class A8_OddNumbers{
	public static void main(String args[]){
		int i;
		for(i = 1; i <= 100; i++){
			if((i % 2) != 0){
				System.out.println(i);
			}
		}
	}
}