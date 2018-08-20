package com.qf.day16_4;

public class Animal implements Comparable<Animal>{
	private String nickname;
	private int age;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(String nickname, int age) {
		super();
		this.nickname = nickname;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [nickname=" + nickname + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		int num1= this.age-o.age;
		int num2=this.nickname.compareTo(o.nickname);
		return num1==0?num2:num1;
	}
	
}
