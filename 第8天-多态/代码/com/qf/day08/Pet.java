/*
������
*/
package com.qf.day08;
public class Pet{
	private int id; //id ������
	private String name;// �����ǳ�
	private int health;// ����ֵ
	private int love;// ���ܶ�

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setHealth(int health){
		this.health=health;
	}
	public int getHealth(){
		return health;
	}
	public void setLove(int love){
		this.love=love;
	}	
	public int getLove(){
		return love;
	}

	//����
	public void print(){
		System.out.println("����id:"+this.id+",�����ǳ�:"+this.name+",����ֵ:"+health+",���ܶ�:"+love);
	}

	public void eat(){
		System.out.println(name+"�����ʳ��.....");
	}

	
}