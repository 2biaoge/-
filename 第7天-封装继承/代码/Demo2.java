/*
引用类型传递
*/
public class Demo2{
	public static void main(String[] args){
		//1创建学生
		Student liangliang=new Student();
		liangliang.age=20;
		System.out.println("修改之前:"+liangliang.age);
		change(liangliang);
		System.out.println("修改之后:"+liangliang.age);
	}
	//改变
	public static void change(Student s){  //引用类型传递参数
		s.age=25;
		System.out.println(s.age+"----------");
	}
}