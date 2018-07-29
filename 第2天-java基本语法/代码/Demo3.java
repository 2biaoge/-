/*
练习1：银行账户存储1000元，年利率是0.05，计算一年后账户余额？

	      要求：使用变量保存数据

*/
public class Demo3{
	public static void main(String[] args){
		//1声明变量并赋值
		int account=1000;
		//2利率
		double rate=0.05;
		//3计算一年之后
		double yu=account*rate+account;
		System.out.println(yu);
		
		
	}
}