public class TestBook{
	public static void main(String[] args){
		Book java=new Book();
		java.bookname="java��������";
		java.pageCount=10000;
		java.price=99.8;
		java.author="��������";
		java.print();
		int r=java.hashCode();
		System.out.println(r);
	}
}