package com.qf.day23;

import java.lang.reflect.Method;
import java.text.StringCharacterIterator;

public class Demo2 {
	public static void main(String[] args) throws Exception{
		//反射main方法
		Class<?> class1=Class.forName("com.qf.day23.HelloWorld");
		//获取方法
		Method method=class1.getMethod("main", String[].class);
		Method method2=class1.getMethod("main2",String.class,String.class,String.class);
		//调用
		method.invoke(null,(Object)new String[]{"xxx","yyy","zzz"});
		method2.invoke(null,new String[]{"xxx","yyy","zzz"});
	}
}
