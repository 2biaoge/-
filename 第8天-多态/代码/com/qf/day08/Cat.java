/*
è��
*/
package com.qf.day08;
public class Cat extends Pet{
	private String hobby;
	public void setHobby(String hobby){
		this.hobby=hobby;
	}
	public String getHobby(){
		return hobby;
	}

	public void print(){
		int id=getId();
		String name=getName();
		int health=getHealth();
		int love=getLove();
		System.out.println("è��id:"+id+" �ǳ�:"+name+" ����ֵ:"+health+" ���ܶ�:"+love+" ����:"+hobby);
	}

	public void eat(){
		String name=getName();
		System.out.println(name+"��ڳ�С��....");
		//���ӽ���ֵ
		int health=getHealth();
		setHealth(health+5);
	}

	public void hideAndSeek(){
		String name=getName();
		System.out.println(name+"��׽�Բ�...");
		int health=getHealth();
		setHealth(health-5);
	}
}