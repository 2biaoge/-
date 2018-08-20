/*
测试Person
*/
public class TestPerson{
	public static void main(String[] args){
		Person zhangsan=new Person();
		//zhangsan.name="张三";
		zhangsan.setName("张三");
		//zhangsan.age=-20;
		zhangsan.setAge(-20);
		zhangsan.show();
	}
}