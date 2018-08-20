/*
QFStudent管理类
输入学生信息

修改学生信息（学生作为参数传递）
*/
import java.util.Scanner;
public class QFStudentManager{
	//输入学生信息
	public QFStudent inputStudent(){
		//1创建input对象
		Scanner input =new Scanner(System.in);
		//2提示
		System.out.println("请输入学生的学号");
		String stuNo=input.next();
		System.out.println("请输入学生的姓名");
		String name=input.next();
		System.out.println("请输入学生的年龄");
		int age=input.nextInt();
		System.out.println("请输入学生的地址");
		String address=input.next();

		//3创建学生对象
		QFStudent bingbing=new QFStudent();
		bingbing.name=name;
		bingbing.stuNo=stuNo;
		bingbing.age=age;
		bingbing.address=address;
		bingbing.show();
		return bingbing;//返回bingbing的地址
	}
	//只能修改姓名和年龄
	public void modify(QFStudent s){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入新的名字");
		String newname=input.next();
		System.out.println("请输入新的年龄");
		int newage=input.nextInt();
		s.name=newname;
		s.age=newage;

		s.show();

		
	}
}