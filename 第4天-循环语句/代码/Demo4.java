/*
求10的阶乘
*/
public class Demo4{
	public static void main(String[] args){
		//1初始化变量
		int sum=1;
		int j=1;
		//2循环条件
		while(j<=10){
			sum=sum*j; //sum*=j;
			j++;
		}
		System.out.println("10的阶乘是："+sum);
	}
}