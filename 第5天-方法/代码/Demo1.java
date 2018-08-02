/*
 无参方法的声明
*/
public class Demo1{
	public static void  main(String[] args){
		//调用
		method1();		
		method2();
		//调用
		int r=method3();
		System.out.println(r);
		
	}
	//定义一个方法,方法名method1,无参，无返回值
	public static void  method1(){
		for(int i=0;i<10;i++){
			System.out.println("hello world");
		}
	}

	//定义一个方法
	public static void method2(){
		for(int i=0;i<5;i++){
			System.out.println("好好学习，天天向上");
		}
	}

	//定义一个方法 ，带返回值类型整数
	public static int method3(){
		int a=10;
		int b=20;
		int c=a+b;	
		return c; //return 返回c
	}
	
}