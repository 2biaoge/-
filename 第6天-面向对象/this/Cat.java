public class Cat{
	String name;
	int age;
	String color;

	public Cat(){

	}
	public Cat(String name,int age){

	}

	public Cat(String name,int age,String color){
		this.name=name;
		this.age =age;
		this.color=color;

	}

	public void show(){
		this.name=name;
		this.age =age;
		this.color=color;
		System.out.println("���֣�"+this.name+"   ���䣺"+this.age+"   ��ɫ��"+this.color);
		//this.eat();
	}
	public void eat(){
		this.name=name;
		System.out.println(this.name+"Ҫ�Է�");
	}
}