package com.qf.day08;
public class TestPet{
	public static void main(String[] args){
		Dog afu=new Dog();
		afu.setId(120);
		afu.setName("����");
		afu.setHealth(85);
		afu.setLove(90);
		afu.setStrain("��������");
		afu.print();

		Cat amao=new Cat();
		amao.setId(119);
		amao.setName("��è");
		amao.setHealth(90);
		amao.setLove(70);
		amao.setHobby("����");
		amao.print();

		Master yuhuan=new Master();
		yuhuan.setName("��");
		yuhuan.feed(afu);
		yuhuan.feed(amao);

		Pet p1=new Dog(); //������� ,�������
		Pet p2=new Cat(); //������� ���������
		p1.eat();//��ӡ����ķ���
		p1.print();//��ӡ����ķ���
	}
}