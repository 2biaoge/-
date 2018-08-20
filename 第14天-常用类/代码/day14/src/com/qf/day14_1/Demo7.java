package com.qf.day14_1;
/*
 * 判断代码执行的时间
 */
public class Demo7 {
	public static void main(String[] args) {
		//垃圾回收,相当于匿名对象
		Person person=new Person("张三1", 20);
		new Person("张三2", 20);
		new Person("张三3", 20);
		//回收下垃圾
		System.gc();
		new Person("张三4", 20);
		new Person("张三5", 20);
		new Person("张三6", 20);
		
		
		
		
		
	}
	public static void calcTime(){
		long startTime=System.currentTimeMillis();
		for(int i=-999999;i<999999;i++){
			
			for(int j=-999999;j<99999;j++){
		
				for(int z=-9;z<9;z++){
					
				}
			}
		}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}	
