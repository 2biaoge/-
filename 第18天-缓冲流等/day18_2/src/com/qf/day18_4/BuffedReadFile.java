package com.qf.day18_4;
/*
 * 装饰类 增强类
 */
public class BuffedReadFile extends ReadFile{
	
	private ReadFile readFile;
	
	
	public BuffedReadFile(ReadFile readFile) {
		this.readFile = readFile;
	}


	public void read(){
		System.out.println("使用缓冲功能读取文件");
		readFile.read();
	}
}
