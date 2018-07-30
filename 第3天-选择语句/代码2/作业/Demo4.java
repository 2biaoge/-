/*
输入一个年份，判断年是否是闰年
*/
import java.util.Scanner;
public class Demo4{
	public static void main(String[] args){
		//1创建对象
		Scanner input=new Scanner(System.in);
		//2提示
		System.out.println("请输入一个年份");
		int year=input.nextInt();
		//3判断
		if((year%4==0&&year%100!=0) || year%400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");	
		}
	
	}
}