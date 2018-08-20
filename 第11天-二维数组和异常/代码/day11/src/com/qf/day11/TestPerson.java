package com.qf.day11;

public class TestPerson {
	public static void main(String[] args) {
		try {
			Person p=new Person();
			p.setName("亮亮");
			p.setAge(120);
			p.setSex('妖');
			
			p.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
