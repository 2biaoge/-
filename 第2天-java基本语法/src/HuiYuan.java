import java.util.Scanner;    //导入Scanner函数

public class HuiYuan{
	public static void main(String[]args){
Scanner input =new Scanner(System.in);      //创建对象
		System.out.println("会员号：");

		int a=input.nextInt();     //输入数字

		int ge;
		int shi;
		int bai;
		int qian;
		
		qian = a/1000;
		bai =a/100%10;
		shi =a/10%10;
		ge =a%10;
			System.out.println("千位："+qian);
			System.out.println("百位："+bai);
			System.out.println("十位："+shi);
			System.out.println("个位："+ge);
			System.out.println("四位的和："+(qian+bai+shi+ge));		
		
	}
}