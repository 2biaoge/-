/*
Person
*/
public class Person{
	//属性 私有的
        private String name;
	private int age;//在合理范围之内才有意义 1-120

	//获取name
	public String getName(){
		return name;
	}
	//设置name
	public void setName(String name){
		this.name=name;	
	}
	//获取age
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if(age<1||age>120){
			this.age=18;
		}else{
			this.age=age;
		}
	}


	public void show(){
		System.out.println("姓名:"+name+",年龄:"+age);	
	}
}