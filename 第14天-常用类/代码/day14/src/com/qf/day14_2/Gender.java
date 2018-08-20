package com.qf.day14_2;
/*
 * 可以在枚举中添加私有的构造方法
 */
public enum Gender {
	MALE("男"),FEMALE("女");
	private String value;
	private Gender(String s){
		this.value=s;
	}
	public String getValue(){
		return value;
	}
}
