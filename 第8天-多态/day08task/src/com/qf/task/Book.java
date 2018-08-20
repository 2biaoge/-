package com.qf.task;
/*
 * 设计一个图书类Book，包括私有属性：编号、书名、价格，实现图书自动编号
 */
public class Book {
	private int id;
	private String bookname;
	private double price;

	public static int count=0;//计数
	{
		count++;
		this.id=count;
	}
	public Book() {	
	}
	public Book(String bookname, double price) {
		this.bookname = bookname;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public void show(){
		System.out.println("编号:"+this.id+" 书名:"+this.bookname+" 价格:"+this.price);
	}
	
	
	
}
