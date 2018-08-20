package com.qf.task;
/*
 * 设计一个图书类Book，包括私有属性：编号、书名、价格，实现图书自动编号
 */
public class Demo1 {
	public static void main(String[] args) {
		//1创建书籍数组
		Book java=new Book("java从入门到精通", 88.9);
		Book html=new Book("html从0到1", 9.99);
		Book ui=new Book("ui是如何炼成的", 9.99);
		Book[] books={java,html,ui};
		
		//BookTools.searchBook(books, 3);
		
		Book[] books2=BookTools.searchBook(books, 9.99);
		for(Book b:books2){
			if(b!=null){
				b.show();
			}
		}
	}
}
