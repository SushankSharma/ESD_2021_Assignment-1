/*14. Implement a JAVA program to find the Mean of given 5 numbers.*/
/* input through command line args*/

class A14_Mean{
	public static void main(String args[]){
		double [] numbers = new double[5];
		double mean;
		int i;
		double sum = 0;
		for(i = 0; i < 5; i++){
			numbers[i] = Double.parseDouble(args[i]);
		}
		for(i = 0; i < 5; i++){
			sum = numbers[i] + sum;
		}
		mean = sum / 5;
		System.out.println("mean is "+mean);
	}
}