/*
学生类
*/
public class Student{
	//1属性
	String name;	//姓名	
	int age;        //年龄
	String stuNo;   //学号
	String clazz;   //班级

	public Student(){
	}
	public Student(String n,int a){
		name=n;
		age=a;
	}
	public Student(String n,int a,String sn){
		name=n;
		age=a;
		stuNo=sn;
	}


	//2方法
	//学习
	public void study(){
		System.out.println(name+",五点起,0点睡，不贪恋爱，不逛街，不抽烟，不喝酒，好好学习，报效祖国");	
	}
	public void eat(){
		System.out.println(name+"饿了，开始吃饭了....");
	}
	public void sleep(){
		System.out.println(name+"困了，开始睡觉了....");
	}
	public void show(){
		System.out.println("姓名："+name+",年龄："+age+"，学号:"+stuNo+",班级:"+clazz);		
	}
}