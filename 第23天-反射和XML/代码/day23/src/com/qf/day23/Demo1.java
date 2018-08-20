package com.qf.day23;

import java.awt.List;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 使用反射操作Student
 */
public class Demo1 {
	public static void main(String[] args) throws Exception {
		//getClassObj();
		//getConstructor();
		//getMethod();
		getField();
	}
	/*
	 * 获取一个类的类对象
	 */
	public static void getClassObj() throws Exception{
		//1第一种方式 通过对象的getClass方法获取
		Student zhangsan=new Student();
		Class<?> class1 = zhangsan.getClass();
		System.out.println(class1.hashCode());
		//2第二种方式，通过类名.class属性
		Class<?> class2=Student.class;
		System.out.println(class2.hashCode());
		//3第三种方式，通过Class的forName方法获取
		Class<?> class3=Class.forName("com.qf.day23.Student");
		System.out.println(class3.hashCode());
		
	}
	/*
	 * 获取构造方法
	 */
	public static void getConstructor() throws Exception{
		//1获取类对象
		Class<?> class1 = Class.forName("com.qf.day23.Student");
		//2获取构造方法(公开的)
		Constructor<?>[] constructors = class1.getConstructors();
		//获取私有、公开的
		//Constructor<?>[] constructors = class1.getDeclaredConstructors();
//		for (Constructor<?> con : constructors) {
//			System.out.println(con);
//		}
		//3获取一个
		Constructor<?> con2=class1.getConstructor();
		Constructor<?> con3=class1.getConstructor(String.class,int.class,String.class);
		System.out.println(con2);
		System.out.println(con3);
		
		//4创建对象
		Object lisi = con2.newInstance();
		Object wangwu=con3.newInstance("王五",20,"男");
	}

	public static void getMethod() throws Exception{
		//1创建Student的类对象
		Class<?> class1 = Class.forName("com.qf.day23.Student");
		//2获取普通方法 
		//2.1获取所有的公开的方法，包括继承的
		//Method[] methods = class1.getMethods();
		//2.2获取所有的方法，不包括继承的
//		Method[] methods = class1.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method);
//		}
		
		//2.3获取一个方法--->无参无返回值
		Method method=class1.getMethod("show"); // 正常调用 Student s=new Student(); s.show();
		//2.4调用方法
		Object lisi=class1.newInstance();//默认调用无参构造方法创建对象
		method.invoke(lisi); //lisi.show();
		//2.5获取一个方法---->带参数的方法
		Method method2=class1.getMethod("show", String.class);
		method2.invoke(lisi, "你是谁啊，不认识你");
		//2.6获取一个带返回值的方法
		Method method3=class1.getMethod("getInfo");
		String result=(String) method3.invoke(lisi);
		System.out.println(result);
		//2.7获取静态方法 
		Method method4=class1.getMethod("print");//正常调用静态方法，类名.print  
		method4.invoke(null);
		
		//2.8获取私有方法
		Method method5=class1.getDeclaredMethod("sayHi");
		//访问权限无效
		method5.setAccessible(true);
		method5.invoke(lisi);
		
	}
	/*
	 * 获取属性
	 */
	public static void getField() throws Exception{
		//1获取类对象
		Class<?> class1=Class.forName("com.qf.day23.Student");
		//2获取属性
//		Field[] declaredFields = class1.getDeclaredFields();
//		for (Field field : declaredFields) {
//			System.out.println(field);
//		}
		Field nameField = class1.getDeclaredField("name"); //Student s=new Student(); s.name="xxx";
		//3赋值
		Object wangwu = class1.newInstance();
		nameField.setAccessible(true);
		nameField.set(wangwu, "王五");//wangwu.name="王五";
		//4获取
		Object result=nameField.get(wangwu);
		System.out.println(result);
		//5获取静态属性
		Field countryField = class1.getDeclaredField("country");
		countryField.setAccessible(true);
		countryField.set(null, "china");
		System.out.println(countryField.get(null));
		
		//6获取包
		Package package1 = class1.getPackage();
		System.out.println(package1.getName());

	}
}
