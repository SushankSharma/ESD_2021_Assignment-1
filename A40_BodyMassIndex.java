/*40. Implement a Java program to compute body mass index (BMI).*/

class A40_BodyMassIndex{
	public static void main(String args[]){
		double weight = 68; //weight in kgs
		double height = 1.82; //height in meters
		double bmi = weight/(height * height);
		System.out.println("BMI : "+bmi);
	}
}