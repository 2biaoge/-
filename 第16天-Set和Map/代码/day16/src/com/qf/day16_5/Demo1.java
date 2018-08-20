package com.qf.day16_5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 使用Map集合
 * 特点：
 * 1 存储键值对，键不能重复,值可以重复
 * 2 无序的
 */
public class Demo1 {
	public static void main(String[] args) {
		//1创建对象
		Map<String, String> map=new HashMap<String,String>();
		//2添加数据
		map.put("cn", "中国");
		map.put("usa", "美国");
		map.put("jp", "日本");
		map.put("kor", "韩国");
		map.put("us","美国");
		System.out.println("元素个数:"+map.size());
		System.out.println(map);
		//3删除
		//map.remove("us");
		//System.out.println("删除之后:"+map);
		//map.clear();
		//4遍历
		//4.1使用entrySet遍历
		System.out.println("---------使用entrySet方法遍历----------");
		//Set<Map.Entry<String, String>> entries=map.entrySet();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		//4.2使用keySet遍历
		System.out.println("---------使用keySet方法遍历----------");
		//Set<String> keySet=map.keySet();
		for (String key : map.keySet()) {
			System.out.println(key+"----->"+map.get(key));
		}
		//4.3使用迭代器
//		System.out.println("----------使用迭代器----------");
//		Set<Map.Entry<String, String>> entries=map.entrySet();
//		Iterator<Map.Entry<String, String>> iterator=entries.iterator();
//		while(iterator.hasNext()){
//			Map.Entry<String, String> entry=iterator.next();
//			System.out.println(entry.getKey()+"---->"+entry.getValue());
//		}
		
		//5判断
		System.out.println(map.containsKey("cn"));
		System.out.println(map.containsValue("泰国"));
		
		
		
		
	}
}
