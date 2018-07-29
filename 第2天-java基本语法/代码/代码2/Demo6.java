/*
逻辑运算符
*/
public class Demo6{
	public static void main(String[] args){
		System.out.println(true&true);
		System.out.println(true|false);
		System.out.println(false&false);

		//结合关系运算符
		System.out.println(10>5&20>30);

		//异或^  不同为真，其他全是假
		System.out.println("----------------");
		System.out.println(true^false);
		System.out.println(true^true);
		System.out.println(false^false);

		System.out.println(!true);

		
		
		
	}
}