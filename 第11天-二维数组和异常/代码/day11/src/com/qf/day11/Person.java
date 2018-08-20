package com.qf.day11;
/*
 * Person
 */
public class Person {
	private String name;
	private int age;
	private char sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=1&&age<=100){
			this.age=age;
		}else{
			throw new AgeException("年龄必须在1-100之间");
		}
		
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		if(sex=='男'||sex=='女'){
			this.sex=sex;
		}else{
			//抛出异常
			throw new SexException("性别输入错误");//抛出异常
		}
		
	}
	
	public void show(){
		System.out.println("姓名:"+this.name+" 年龄："+this.age+" 性别："+this.sex);
	}
	
}
