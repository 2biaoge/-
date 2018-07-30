/*
练习三:求1-100的和
1+2+3+4+....+100
*/
public class Demo3{
	public static void main(String[] args){
		//1初始化变量
		int i=1;
		int sum=0;//保存和
		//2循环条件
		while(i<=100){
			sum=sum+i;	
			i++;
		}
		System.out.println("1-100的和是:"+sum);
		
	}
}