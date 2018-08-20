package com.qf.task;
/*
 * 书籍工具类
 */
public class BookTools {

	//根据编号搜索图书
	public static void searchBook(Book[] books,int id){
		for(int i=0;i<books.length;i++){
			Book b=books[i];
			if(b.getId()==id){
				b.show();
			}
		}
	}
	public static Book[] searchBook(Book[] books,double price){
		Book[] books2=new Book[books.length];
		int count=0;
		for(int i=0;i<books.length;i++){
			Book b=books[i];
			if(b.getPrice()==price){
				books2[count]=b;
				count++;
			}
		}
		return books2;
	}
	
}
