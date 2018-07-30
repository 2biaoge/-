/*
上机练习2：输入四位数字的会员号的百位数字等于产生的随机数字即为幸运会员，提示恭喜您中奖了，否则没中奖。
*/
import java.util.Scanner;
public class Demo5{
	public static void main(String[] args){
		//创建Input对象
		Scanner input=new Scanner(System.in);
		//提示
		System.out.println("请输入四位的会员号:");
		int member=input.nextInt();

		//百位
		int bai=member/100%10;
		int ran=(int)(Math.random()*10);   //Math.random();产生0-1之间的一个数字，含0不含1 
		if(bai==ran){
			System.out.println("中奖了....旅游去吧");
		}else{
			System.out.println("好好干活...");
		}
	}

}