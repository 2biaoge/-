/*
dog��̳�Pet��
*/
package com.qf.day08;
public class Dog extends Pet{
	private String strain;
	public void setStrain(String strain){
		this.strain=strain;
	}
	public String getStrain(){
		return strain;
	}

	public void print(){
		int id=getId();
		String name=getName();
		int health=getHealth();
		int love=getLove();
		System.out.println("����id:"+id+" �ǳ�:"+name+" ����ֵ:"+health+" ���ܶ�:"+love+" Ʒ��:"+strain);
	}

	public void eat(){
		String name=getName();
		System.out.println(name+"��ڳԹ���....");
		//���ӽ���ֵ
		int health=getHealth();
		setHealth(health+3);
	}
	//����
	public void catchBall(){
		String name=getName();
		System.out.print(name+"�������Ϸ....");
		int health=getHealth();
		setHealth(health-3);
	}


}