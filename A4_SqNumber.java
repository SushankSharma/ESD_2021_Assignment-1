/* code to print the square of a number inputl provided through command line*/
import java.util.Scanner;
class A4_SqNumber{
	public static void main(String args[]){
		Double num;
        Scanner sc= new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        num=sc.nextDouble();
         
        Double square = num*num;
		System.out.println("Square of "+ num + " is: "+ square);
	}
}