/*13. Implement a JAVA program to find the max and min of given two numbers.*/
/*input through command line arg*/

class A13_MaxMin{
	public static void main(String args[]){
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		if(num1 > num2)
			System.out.println(num1+" is greatest");
		else
			System.out.println(num2+" is greatest");
	}
}