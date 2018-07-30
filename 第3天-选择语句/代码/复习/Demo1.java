/*
自动类型转换
1 2 int常量
*/
public class Demo1{
	public static void main(String[] args){
		byte b1=20;  //20 int常量
		byte b2=127;
		short s2=128; //128 int常量
		char c1='a';
		char c2=97;

		//加法运算
		int i=b1+s2;

		int i2=b1+c1;
		System.out.println(i);
		System.out.println(i2);
		
		//System.out.println("awiefiawji"+"\n"+"awejfiajwegwae");

		float f=3.1415f;
		int num=129;
		byte b3=(byte)num;
		System.out.println();	


		//强制转换 
		int  num3=100;
		byte b5=(byte)num3;

		//取模（求余）
		int yu=5%3;
		int yu1=3%5;
		//double d3=3.5%3;
		System.out.println(yu);
		System.out.println(yu1);
		System.out.println(d3);
			
		
		
	}
}