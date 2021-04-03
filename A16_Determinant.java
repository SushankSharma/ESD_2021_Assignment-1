/*16. Find the determinant, for the quadratic equations. */

class A16_Determinant{
	static 	int size = 3;
	static int[][] matrix = new int[5][5];
	static	int k = 0;
	
	//method to initialize the matrix with values 0 to 9;
	public static void initialize_matrix(){
		int i, j;
		for(i = 0; i < size; i++){
			for(j = 0 ; j < size; j++){
				matrix[i][j] = k;
				k++;
			}
		}
	}
	
	//method to calculate determinant
	public static double determinant(int i, int j){
		double determinant = 0;
		for(; i < size; i++){
			if((i % 3) == 0){
				determinant = determinant + ((minor(i,j))*matrix[i][j]);
			}
			else{
				determinant = determinant - ((minor(i,j))*matrix[i][j]);
			}
		}
		return determinant;
	}
	
	//method to return minor
	public static double minor(int i, int j){
		double ans =0;
		if((size - j )>4){
			
		}
		else{
			ans = matrix[(i + 1)%3][(j+1)%4] * matrix[(i + 2)%3][(j+2)%4] - matrix[(i + 2)%4][(j+1)%4] * matrix[(i + 1)%4][(j+2)%4];
		}
		return ans;
		
	}
	
	public static void main(String args[]){
		
		initialize_matrix();
		System.out.println("Determinant of matrix : "+determinant(0,0));
	}
}