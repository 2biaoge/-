/*
����
*/
package com.qf.day08;
public class Master{
	private String name;	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	/*
	public void feed(Dog d){
		System.out.println(name+"Ҫ������ιʳ��...");
		d.eat();
		d.print();
	}
	public void feed(Cat c){
		System.out.println(name+"Ҫ��è��ιʳ��...");
		c.eat();
		c.print();
	}*/

	public void feed(Pet p){
		String n=p.getName();
		System.out.println(name+"Ҫ��"+n+"ιʳ��...");
		p.eat();//������д�ķ���
		p.print();//������д�ķ���
	}
	//����
	public Pet adopt(int type){
		if(type==1){
			Pet d=new Dog();
			d.setHealth(80);
			d.setLove(50);
			return 	d;
		}else if(type==2){
			Pet c=new Cat();
			c.setHealth(80);
			c.setLove(50);
			return 	c;
		}else{
			return null;
		}
	}

	public void play(Pet pet){
		
		Dog d=(Dog)pet;
		d.catchBall();
		
	}

	
}