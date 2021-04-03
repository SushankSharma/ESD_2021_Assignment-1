/*38. Implement a Java program that reads a number in inches, converts it to meters(CLA)*/

class A38_InchToMeter{
	public static void main(String args[]){
		double inch = Double.parseDouble(args[0]);
		double meter = 0.0254 * inch;
		System.out.println(" In meters : "+meter);
	}
}