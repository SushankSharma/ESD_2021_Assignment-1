/*17. Find the distance between two points, using euclidean distance.*/

import java.lang.Math;

class A17_DistancePoint{
	public static void main(String args[]){
		int x1= 1;
		int x2 = 3;
		int y1 = 5;
		int y2 = 7; //Distance = [sqrt[[3-1]^2]+[[7-5]^2]]
		Double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
		System.out.println("Distance : " + distance);
	}
}