/*
Student
*/
public class Student{
	String name;
	int age;
		
	//静态的成员变量
	static int totalCount;

	//统计学生的人数
	public static void calcTotalCount(){
		System.out.println("开始统计学生人数....");
		totalCount=10000;		
	}
}