package com.qf.day08;
public class TestPet{
	public static void main(String[] args){
		Dog afu=new Dog();
		afu.setId(120);
		afu.setName("阿福");
		afu.setHealth(85);
		afu.setLove(90);
		afu.setStrain("拉布拉多");
		afu.print();

		Cat amao=new Cat();
		amao.setId(119);
		amao.setName("阿猫");
		amao.setHealth(90);
		amao.setLove(70);
		amao.setHobby("爬树");
		amao.print();

		Master yuhuan=new Master();
		yuhuan.setName("玉环");
		yuhuan.feed(afu);
		yuhuan.feed(amao);

		Pet p1=new Dog(); //父类变量 ,子类对象
		Pet p2=new Cat(); //父类变量 ，子类对象
		p1.eat();//打印子类的方法
		p1.print();//打印子类的方法
	}
}