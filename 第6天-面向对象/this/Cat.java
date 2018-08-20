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
		System.out.println("名字："+this.name+"   年龄："+this.age+"   颜色："+this.color);
		//this.eat();
	}
	public void eat(){
		this.name=name;
		System.out.println(this.name+"要吃饭");
	}
}