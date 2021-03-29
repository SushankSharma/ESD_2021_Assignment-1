/*41. Implement a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).*/

class A41_Speed{
	public static void main(String args[]){
		double distance = 138000; // in meters
		int sec = 00;
		int min = 15;
		int hour = 3;
		
		double totalSec= (double)(sec + (min * 60) + ( hour * 60 * 60));
		double mps = distance/ totalSec;
		double kmph = 3.6 * mps;
		double mph = 2.23694 * mps;
		
		System.out.println(" mps : "+mps+"\n kmph: "+kmph+"\n mph : "+mph); 
		
	}
}