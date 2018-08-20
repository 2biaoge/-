package com.qf.day18_4;
/*
 * 装饰类 ：提供新的打印方法
 */
public class PrintReadFile extends ReadFile{
	
	private ReadFile readFile;
	public PrintReadFile( ReadFile readFile) {
		this.readFile=readFile;
	}
	public void read(){
		
	}
	
	public void print(){
		
	}
	public void println(){
		
	}
}
