/*
++
*/
public class Demo15{
	public static void main(String[] args){
		int d = 5;
		System.out.println((d++));// �����1 
		System.out.println((d));// �����1 
		
		int e = d++ + 6;
		System.out.println(e);// �����1

		int f = d-- + 6;
		System.out.println(f);// �����1 
	}
}
