public class Demo1{
	public static void main(String[] args){
		int num1=10;	
		int num2=10;
		System.out.println(num1==num2); //==�Ƚϵ���ջ�д�ŵ�ʵ������

		Book java=new Book();
		java.bookname="java�����ŵ�����";
		
		Book c=new Book();
		c.bookname="c�����ŵ���·";
		
		System.out.println(java==c); //==�Ƚϵ���ջ�д�ŵĵ�ַ
		boolean b=java.equals(c); //Object��equals������==һ��
		System.out.println(b);

		System.out.println("----------------------------");
		Book yuwen=new Book();
		yuwen.bookname="������";
		Book yuwen2=new Book();
		yuwen2.bookname="������2";
		System.out.println(yuwen==yuwen2);
		System.out.println(yuwen.equals(yuwen2));
	}
}