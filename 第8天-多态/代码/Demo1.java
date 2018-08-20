public class Demo1{
	public static void main(String[] args){
		int num1=10;	
		int num2=10;
		System.out.println(num1==num2); //==比较的是栈中存放的实际数据

		Book java=new Book();
		java.bookname="java从入门到放弃";
		
		Book c=new Book();
		c.bookname="c从入门到跑路";
		
		System.out.println(java==c); //==比较的是栈中存放的地址
		boolean b=java.equals(c); //Object中equals方法和==一样
		System.out.println(b);

		System.out.println("----------------------------");
		Book yuwen=new Book();
		yuwen.bookname="语文书";
		Book yuwen2=new Book();
		yuwen2.bookname="语文书2";
		System.out.println(yuwen==yuwen2);
		System.out.println(yuwen.equals(yuwen2));
	}
}