package com.qf.day18_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * Properties的使用
 */
public class PropertiesDemo {
	public static void main(String[] args)  throws Exception{
		//1创建Properteis集合
		Properties properties=new Properties();
		//2添加
		properties.setProperty("name", "zhangsan");
		properties.setProperty("age", "20");
		properties.setProperty("adress", "北京昌平沙河");
		//3删除
		//4遍历
		//4.1增强for
//		for (Map.Entry<Object, Object> entry:properties.entrySet()) {
//			System.out.println(entry.getKey()+"--->"+entry.getValue());
//		}
		//4.2使用stringPropertyNames
		Set<String> set=properties.stringPropertyNames();
		for (String pro : set) {
			System.out.println(pro+"---"+properties.getProperty(pro));
		}
		
		//5和流有关
		properties.list(System.out);
		//6获取系统有关的属性
		Properties sysPros= System.getProperties();
		sysPros.list(System.out);//输出到控制
		sysPros.list(new PrintStream(new FileOutputStream("d:\\sys.properties")));//输出文件中
		
		//7load加载文件setting.propertes
		Properties properties2=new Properties();
		properties2.load(new FileReader("d:\\setting.properties"));
		
		properties2.list(System.out);
		
		//8store 存储到文件中
		properties2.store(new FileWriter("d:\\setting2.properties"), "xxx");
	}
}
