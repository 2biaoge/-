/*
è��
*/
public class Cat{
	String name;//�ǳ�
	int age;//����
	String color;//��ɫ

	//���췽��
	public Cat(){
		//this("����",1);//���ô��ι��췽��
		System.out.println("�޲ι���ִ����......");
	}
	public Cat(String name,int age){
		this();//�����޲ι��췽��
		this.name=name;	
		this.age=age;	
		
	}
	public Cat(String name,int age,String color){
		this();//�����޲ι��췽��
		this.name=name;
		this.age=age;
		this.color=color;	
	}

	//����
	public void show1(){
		System.out.println("�ǳ�:"+this.name);	
		this.show2();

	}

	public void show2(){
		System.out.println("����:"+this.age);
	}
}