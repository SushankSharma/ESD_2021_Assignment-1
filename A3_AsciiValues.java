/*3. Implement a JAVA program to print the ASCII values of A-Z, 0-9 , a-z.*/
class A3_AsciiValues{
	public static void main(String args[]){
		int ch = 'A';
		while(ch <= 'Z'){
			char letter = (char)ch;
			System.out.println(letter+" : "+ch);
			ch = ch + 1;
		}
		ch = '0';
		while(ch <= '9'){
			char letter = (char)ch;
			System.out.println(letter+" : "+ch);
			ch = ch + 1;
		}
		ch = 'a';
		while(ch <= 'z'){
			char letter = (char)ch;
			System.out.println(letter+" : "+ch);
			ch = ch + 1;
		}
	}
}