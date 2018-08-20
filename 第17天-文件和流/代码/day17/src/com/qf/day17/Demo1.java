package com.qf.day17;

import java.io.File;
import java.io.FilenameFilter;
import java.sql.Date;

import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * File类
 * 表示硬盘的文件和文件夹
 */
public class Demo1 {
	public static void main(String[] args) throws Exception {
		//fileConstructor();
		//fileOpe();
		dirOpe();
	}
	/*
	 * 1 File类的构造方法
	 */
	public static void fileConstructor(){
		//1创建对象 表示硬盘上的文件,文件可能存在，也可能不存在
		File file=new File("d:\\aaa.txt");
		File file2=new File("d:\\haha.txt");
		
		File file3=new File("d:\\", "heihei.txt" );
		File parent=new File("d:\\");
		File chile1=new File(parent, "123.txt");
		File chile2=new File(parent, "456.txt");
		File chile3=new File(parent, "789.txt");
		
		System.out.println(file.toString());
		System.out.println(file2.toString());
		System.out.println(file3.toString());
	}

	/*
	 * 2 文件操作
	 */
	public static void fileOpe() throws Exception{
		//1创建File对象
		File file=new File("d:\\123.txt");
		//File file2=new File("123.txt");
		//2创建文件
		if(!file.exists()){
			boolean b=file.createNewFile();
			System.out.println(b);
			System.out.println("123.txt创建成功");
		}
		//3删除
//		boolean b1=file.delete();
		//file.deleteOnExit();//jvm退出时，删除文件
//		if(b1){
//			System.out.println("删除成功");
//		}
		//4判断
		//4.1能不能执行，在windows系统中，文件存在则为true
		System.out.println("canExecute():"+file.canExecute());
		//4.2能不能读取
		System.out.println("canRead():"+file.canRead());
		//4.3能不能写
		System.out.println("canWrite():"+file.canWrite());
		//5获取
		//5.1获取绝对路径名字符串
		System.out.println("getAbsolutePath():"+file.getAbsolutePath());
		//5.2获取规范路径名字符串
		System.out.println("getCanonicalPath():"+file.getCanonicalPath());
		//5.3获取文件名称
		System.out.println("getName() :"+file.getName());
		//5.4获取父目录名称
		System.out.println("getParent() :"+file.getParent());
		//5.5获取路径名
		System.out.println("getPath() :"+file.getPath());
		//5.6获取最后的修改时间
		System.out.println("lastModified():"+new Date(file.lastModified()));
		//6判断
		//6.1判断是否是文件
		System.out.println("isFile():"+file.isFile());
		//6.2判断是否是隐藏的
		System.out.println("isHidden():"+file.isHidden());
		//7长度
		System.out.println("length() :"+file.length());
	
		
		
	}
	/*
	 * 3文件夹操作
	 */
	public static void dirOpe(){
		//1创建File
		File dir=new File("d:\\images\\fengjing\\caoyuan");
		//2创建文件夹
		if(!dir.exists()){
			//dir.mkdir();//只能创建一级目录
			dir.mkdirs();//创建多级目录
			System.out.println("创建文件夹成功");
		}
		//3删除
		//dir.delete();
		//4获取
		//4.1获取绝对路径
		System.out.println("getAbsolutePath() ："+dir.getAbsolutePath());
		//4.2获取路径
		System.out.println("getPath()："+dir.getPath());
		//5判断
		System.out.println("isDirectory() :"+dir.isDirectory());
		
		//6获取当前目录下的文件和子文件夹
		System.out.println("-------------list()方法--------------");
		File dir2=new File("d:\\");
		String[] list = dir2.list();
		for (String string : list) {
			System.out.println(string);
		}
		//7获取当前目录下的pdf文件
		System.out.println("-------------list(xxx)方法--------------");
		String[] list2=dir2.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith(".pdf")){
					return true;
				}
				return false;
			}
		});
		for (String string : list2) {
			System.out.println(string);
		}
		
		//8listRoots() 
		File[] files=File.listRoots();
		System.out.println("-----listRoots() ------");
		for (File file : files) {
			System.out.println(file);
		}
	}
	
	
}
