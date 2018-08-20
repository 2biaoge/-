/*
狗狗类继承Animal
*/
public class Dog extends Animal{
	int love;//

	public Dog(){
		super();//省略 无参构造方法
		System.out.println("狗狗无参构造执行了...");
	}
	public Dog(String nickname,String color){
		super(nickname,color);//父类的带参构造
		System.out.println("狗狗带参构造执行了...");	
	}

	public void lookHome(){	
		System.out.println(super.nickname+"看家...亲密度:"+this.love);
		super.print();
		
	}
	
}
