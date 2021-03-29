/*48. Implement a java program to find the memory size in bytes given the input as address length. */

class A48_MemorySize{
	public static void main(String args[]){
		int StartAddr = 10240;
		int EndAddr = 10280;
		int bytes = (EndAddr - StartAddr)/8;
		System.out.println("Memory size in bytes : "+bytes);
	}
}