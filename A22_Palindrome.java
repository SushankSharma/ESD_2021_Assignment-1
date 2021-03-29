/*22. Check whether the number is a palindrome number or not.*/

class A22_Palindrome{
	public static void main(String args[]){
		int num = 1001;
		int temp = num;
		int digit, revNum = 0;
		while(temp > 0){
			digit = temp % 10;
			temp = temp / 10;
			revNum = (revNum * 10) + digit;
		}
		if(revNum == num){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not Palindrome");
		}
	
	}
}