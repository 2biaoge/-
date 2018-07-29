/*
要求：键盘输入四位数字的会员卡号，使用“/”和“%”运算符分解获得会员卡各个位上的数字，将各个位上数字求和
*/
public class Demo4{
	public static void main(String[] args){
		int card=5739;
		int ge=card%10;
		int shi=card/10%10;
		int bai=card/100%10;
		int qian=card/1000;
		int sum=ge+shi+bai+qian;
		System.out.println(sum);
		
	}
}