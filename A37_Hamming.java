/*37. Implement a Java program to create the first twenty Hamming numbersz*/

class A37_Hamming{
	public static void main(String args[]){
		int num = 2, numCopy;
		int count = 0;
		System.out.println("Hamming numbers");
		System.out.println(1);
		while(count < 20){
			numCopy = num;
			while(num % 2 == 0){
				num = num / 2;
			}
			while(num % 3 == 0){
				num = num / 3;
			}
			while(num % 5 == 0){
				num = num / 5;
			}
			if( num == 1){
				System.out.println(numCopy);	/*Prime Factors(Multiplied) = PrimeFact^(0-5)*/ 
				count++;
			}
			
			num = numCopy;
			num++;
		}			
	}
}