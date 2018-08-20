package com.qf.day14_2;

public class Test {
	public static void main(String[] args) {
		Week week=Week.MONDAY;
		System.out.println(week);
		//String sex="妖";
		Gender sex=Gender.FEMALE;
		System.out.println(sex.getValue());
		
		switch (sex) {// byte  short int char String 枚举
		case FEMALE:
			System.out.println("女");
			break;
		case MALE:
			System.out.println("男");
			break;
		default:
			break;
		}
	}
}
