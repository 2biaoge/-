package com.qf.day13;

public class Demo6 {
	public static void main(String[] args) {
		String s1="abc";
		String s2 = new String("abc");
		//System.out.println(s1.value==s2.value);
		//1 字符串的长度
		System.out.println(s2.length());
		String con="wo ai bei jing tian an men,tian an men shang tai yang sheng";
		//2查找子字符串出现的位置
		//2.1查找tian 在con中的位置 第一个出现的位置
		System.out.println(con.indexOf("tian"));
		//2.2从指定位置查找tian 在con中的位置 第一个出现的位置
		System.out.println(con.indexOf("tian", 16));
		//2.3查找tian 在con中的位置 最后一个出现的位置
		System.out.println(con.lastIndexOf("tian"));
		/// info.txt.rar.jpg
		
		//3获取某个位置的字符
		char c=con.charAt(0);
		//4判断某个字符串是否存在
		boolean b=con.contains("tai yang");
		System.out.println(b);
		//5判断字符串中是否有内容
		String e="";
		System.out.println(e.isEmpty());
		//6判断字符串是否是以某个前缀开始的
		String name="张三丰";
		System.out.println("是否是已张开头:"+name.startsWith("王"));
		//7判断字符串是否是以某个后缀开始的
		String file="zhangsan.jpg";
		System.out.println("是否是一jpg结束:"+file.endsWith("jpg"));
		
	}
}
