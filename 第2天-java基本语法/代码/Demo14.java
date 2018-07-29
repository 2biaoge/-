/*
++ 自增
-- 自减
*/

public class Demo14{
	public static void main(String[] args){
		int num=5;
		int num2=++num;// 先num自身加1 ,又赋值给num2
		System.out.println(num2);

		int num3=10;
		int num4=num3++; //num3赋值给num4  10,然后在num3自身加1

		System.out.println(num4);
		System.out.println(num3);
	}
}