package com.qf.task;

public class Student implements Comparable<Student>{
	private int age;
	private String hobby;
	private int score;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int age, String hobby, int score) {
		super();
		this.age = age;
		this.hobby = hobby;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", hobby=" + hobby + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Student o) {
		int n1=this.age-o.age;
		int n2=o.score-this.score;
		return n1==0?n2:n1;
	}
	
	
}
