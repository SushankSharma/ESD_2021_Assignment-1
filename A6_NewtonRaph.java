/*6. Implement a JAVA program to find the square using newton raphson method.*/

class A6_NewtonRaph{

	static double squareRoot(double n, double l)  
    {  
        double x = n;   
        double root;  
        int count = 0;  
      
        while (true) 
        {  
            count++;  
            root = 0.5 * (x + (n / x));  
            if (Math.abs(root - x) < l)  
                break;  
            x = root;  
        }  
      
        return root;  
    }  
       
    public static void main (String[] args)  
    {  
        double n = 25;  
        double l = 0.00001;  
      
        System.out.println(squareRoot(n, l));  
    }  
} 
