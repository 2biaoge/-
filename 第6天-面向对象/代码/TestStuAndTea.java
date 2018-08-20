/*
Student和Teacher测试类
*/
public class TestStuAndTea{
	public static void main(String[] args){
		//创建一个具体的老师
		Teacher laowang=new Teacher();
		laowang.name="王老五";
		laowang.age=33;
		laowang.workYear=10;

		//调用方法
		laowang.remember();
		laowang.work();
			
	
	}
}