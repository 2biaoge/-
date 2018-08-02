/*
方法练习
*/
public class Demo3{
	public static void main(String[] args){	
		sum2();
		sum3(10,20);
		int r=sum4(20,50);
		System.out.println(r);
		
		int r2=sum5(2,3,true);
	}
	//定义一个方法
	void sum1(){
		System.out.println("加法运算1");	
	}
	//定义一个方法 ，公开的，静态的,无返回值，无参
	public static void sum2(){
		System.out.println("加法运算2");
	}
	
	//定义一个方法，带参数
	public static void sum3(int a,int b){
		System.out.println("两个数的和是:"+(a+b));	
	}
	//定义一个方法，带参数，有返回值
	public static int sum4(int a,int b){
		return a+b;	//返回结果，结束方法
	}
	//定义一个方法，带参数，有返回值
	public static int sum5(int a,int b,boolean c){
		return a+b;	//返回结果，结束方法
	}
	
}