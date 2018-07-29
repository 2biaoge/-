/*
浮点类型
float  后面也加上符号  f。
double
 
*/
public class Demo6{
	public static void main(String [] args){
		float f1=3.141592f;  //精度是6-7位
		System.out.println(f1);
		double d1=3.14; //精度15-16位
		System.out.println(d1);

		double d2=1.56e2;
		System.out.println(d2);
		
		double d3=0.9;

		double d4=(1.4-0.5)/0.9;
		
		System.out.println(d4);
	}
}