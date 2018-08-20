package com.qf.day13;
/*
 * String 操作
 */
public class Demo7 {
	public static void main(String[] args) {
		//1 equals方法比较
		String str="hello";
		System.out.println(str.equals("hello"));
		String str2=new String("hello");
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
		//2 忽略大小比较
		String str3="Hello";
		System.out.println(str3.equalsIgnoreCase(str));
		
		//3字符替换
		String con="我爱北京天安门,天安门上太阳升,太阳啊,太阳啊";
		//替换把太阳换成月亮
		String con1=con.replace("太阳", "月亮");
		System.out.println(con1);
		
		//4截取(含头不含尾)
		String sub=con.substring(0, 4);
		System.out.println(sub);
		String sub2=con.substring(4,7);
		System.out.println(sub2);
		//file=file.txt截取后缀名
		String filename="file.txt";
		String ext=filename.substring(filename.lastIndexOf(".")+1);
		System.out.println(ext);
		
		//5 去除前面和尾部的空格
		String address="    北京市昌平区           沙河老牛湾       ";
		String address2=address.trim();
		String address3=address2.replace(" ", "");
		System.out.println(address3);
		//6格式化输出
		System.out.printf("%s","ajfiwef");
		String format=String.format("%.2f-----%b-----%s", 3.14159999f,true,"hello");
		System.out.println(format);
		
		//7比较compareTo
		String a="h";
		String b="W";
		int r=a.compareTo(b); // a在前面，b后面 -1
		System.out.println(r);
		
		//8拼接
		String pin1="hello";
		String pin2="你好";
		String pin3=pin1.concat(pin2);
		String pin4=pin1+pin2;//编译后没有了
		System.out.println(pin3);
		
	}
}
