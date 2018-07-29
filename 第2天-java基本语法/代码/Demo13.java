/*
上机练习1 : 有一个三位数，求十位上 的数字   
*/
public class Demo13{
	public static void main(String[] args){
		int num=123;		
		//十位
		int shi=num/10%10;
		//个位
		int ge=num%10;
		System.out.println(shi);
		System.out.println(ge);
	}
}