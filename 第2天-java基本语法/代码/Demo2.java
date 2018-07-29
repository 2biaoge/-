/*
变量
*/
public class Demo2{
	public static void main(String[] args){
		//1先声明变量，再赋值
		//1.1声明变量
		int num;
		//1.2赋值，把10放入num变量中
		num=10;
		//把20放入num变量中
		System.out.println(num);
		num=20;
		System.out.println(num);//使用变量名num，获取数据

		//2声明同时赋值
		int age=30;
		System.out.println(age);

		//3声明其他类型的变量
		double pi=3.14; //浮点数
		System.out.println(pi);
		String name="张无忌";
		System.out.println(name);
		
		
		
	}
}