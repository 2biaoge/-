/*
hashCode方法
*/
public class Demo3{
	public static void main(String[] args){
		Object o1=new Object();
		Object o2=new Object();

		Book java=new Book();
		java.bookname="java葵花宝典";
		java.author="东方不败";
	
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(java.hashCode());

		System.out.println(o1.toString());
		System.out.println(o2.toString());
		System.out.println(java.toString());
	}
}