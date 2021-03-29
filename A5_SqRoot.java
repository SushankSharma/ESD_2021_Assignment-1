/* program to find the square root of a number input through command line*/
import java.lang.Math;
import java.util.Scanner;

class A5_SqRoot{
	public static void main(String args[]){
		
    {
        Double num;
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        num = sc.nextDouble();
         
        Double squareroot = Math.pow(num, 0.5);
        System.out.println("The SquareRoot of Given Number  " + num + "  =  " + squareroot);
	}
	}
}