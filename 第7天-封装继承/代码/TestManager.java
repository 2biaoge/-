/*
测试学生管理类
*/
public class TestManager{
	public static void main(String[] args){	
		//1创建管理类
		QFStudentManager m=new QFStudentManager();
		//2输入方法
		QFStudent s=m.inputStudent();
		m.modify(s);
	
	}
}