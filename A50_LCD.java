/*50. Implement a java program to find the LCD of the given numbers.*/
//tofind the LCD of fractions 5/6 and 3/7
class A50_LCD{
	int LCD(int num1, int num2){
		int i = 1 , j = 1;
		int temp1 = num1;
		int temp2 = num2;
		
		while(num1 != num2){
			
			if(num2 > num1){
				num1 = temp1 * i;
				i++;
				//System.out.println("num1 "+num1);
				
				}
			if (num1 > num2){
				num2 = temp2 * j;
				j++;
				//System.out.println("num2 "+num2);
				}
				
			
		}
		return num2;
	}
	
	public static void main(String args[]){
		A50_LCD obj = new A50_LCD();
		int num1 = 5;
		int denom1 = 6;
		int num2 = 3;
		int denom2 = 7;
		System.out.println("LCD of fractions : "+obj.LCD(denom1, denom2));
	
	
	}
}