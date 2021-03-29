/*36. Implement a Program in Java to check whether a number is a Keith Number or not*/

class A36_Keith{
	public static void main(String args[]){
		int num = 742;	/*742 = [7+4+2] = 13...*/                    
		int temp = num;
		int[] arr1 = new int[100];
		int[] arr2 = new int[100];
		int length = String.valueOf(num).length();
		//System.out.println(length);
		int sum = 0, i, j = 0; 
		for(i = 0; num > 0; i++){
			arr1[i] = num % 10;        
			//System.out.println(arr1[i]);
			num = num / 10;	/*contd... [4+2+13] = 19...*/
		}
		i--;
		while(i >= 0){
			arr2[j] = arr1[i];
			//System.out.println(arr2[j]);
			i--; j++;	/*... [2+13+19] = 34...*/ 
		}
		j = length - 1;
		while(sum < temp){
			sum = 0;
			for(i = 0; i < length; i++){
				sum = arr2[j - i] + sum;
			}
			j++;
			arr2[j] = sum;	/*... if [n-3+n-2+n-1] = num TRUE else FALSE*/
			
			if(sum == temp){
				System.out.println("Keith number");
				return;
			}
		}
		System.out.println("Not a Keith number");

	}
}