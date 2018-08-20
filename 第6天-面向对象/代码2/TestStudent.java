/*
测试类
*/
public class TestStudent{
	public static void main(String[] args){
		//1创建对象
		Student yangguo=new Student();//调用无参的构造方法
		Student xiaolongnv=new Student("小龙女",1010); //调用有参的构造方法
		Student meichaofeng=new Student("梅超风",1020,"bj1802003");
		yangguo.name="过儿";
		yangguo.age=1000;
		yangguo.stuNo="bj1802001";
		yangguo.clazz="java_bj1802";
		
		yangguo.show();
		for(int i=0;i<5;i++){
			yangguo.study();
		}
		
		yangguo.eat();
		yangguo.sleep();

		xiaolongnv.study();
		meichaofeng.show();
		
	}
}