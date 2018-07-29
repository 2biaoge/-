/*
基本数据类型转换
自动类型转换 
byte-->short--->int--->long-->float--->double

char-->int

byte,short,char三者在计算时会转换成int类型

int整型常量和字符常量在合理范围内可以直接赋值给 byte、short、int、char
*/
public class Demo10{

	public static void main(String[] args){
		byte b1=100;
		short s1=b1;
		int n=s1;
		long l=n;
		float f=l;
		double d=f;
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(d);

		//char --->int
		char c1='中';
		int num=c1;
		System.out.println(num);

		byte b2=10;
		byte b3=5;
		int b4=b2+b3;
		System.out.println(b4);

		short s2=200; //整型常量200 int
		short s3=32767;

		char c2=65535;
		System.out.println(c2);
	}
}