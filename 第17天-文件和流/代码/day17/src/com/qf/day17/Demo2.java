package com.qf.day17;

import java.io.File;

/*
 * 要求：把一个目录下的所有文件和文件夹遍历出来，包括子目录
 * 使用递归
 */
public class Demo2 {
	public static void main(String[] args) {
		//listFiles(new File("d:\\王老五"));
		//deleteDir(new File("c:\\"));
	}
	/*
	 * 递归遍历文件夹
	 */
	public static void listFiles(File dir){
		System.out.println(dir.getAbsolutePath());
		File[] listFiles = dir.listFiles();
		if(listFiles!=null){
			for (File file : listFiles) {
				if(file.isDirectory()){//如果是文件夹自己调用自己
					listFiles(file);
				}else{
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
	
	/*
	 * 递归删除文件夹
	 * 
	 */
	public static void deleteDir(File dir){
//		boolean b=dir.delete();//只能删除空目录
//		System.out.println(b);
		File[] files=dir.listFiles();
		if(files!=null){
			for (File file : files) {
				if(file.isDirectory()){
					deleteDir(file);
				}else{
					System.out.println("删除文件:"+file.getAbsolutePath());
					file.delete();
				}
			}
			
		}
		//删除空文件夹
		System.out.println("删除文件夹:"+dir.getAbsolutePath());
		dir.delete();
		
		
	}
	
	
}
