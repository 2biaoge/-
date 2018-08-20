/*
主人
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
		System.out.println(name+"要给狗狗喂食物...");
		d.eat();
		d.print();
	}
	public void feed(Cat c){
		System.out.println(name+"要给猫咪喂食物...");
		c.eat();
		c.print();
	}*/

	public void feed(Pet p){
		String n=p.getName();
		System.out.println(name+"要给"+n+"喂食物...");
		p.eat();//子类重写的方法
		p.print();//子类重写的方法
	}
	//领养
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