/*
ѧ����
*/
public class Student{
	//1����
	String name;	//����	
	int age;        //����
	String stuNo;   //ѧ��
	String clazz;   //�༶

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


	//2����
	//ѧϰ
	public void study(){
		System.out.println(name+",�����,0��˯����̰����������֣������̣����Ⱦƣ��ú�ѧϰ����Ч���");	
	}
	public void eat(){
		System.out.println(name+"���ˣ���ʼ�Է���....");
	}
	public void sleep(){
		System.out.println(name+"���ˣ���ʼ˯����....");
	}
	public void show(){
		System.out.println("������"+name+",���䣺"+age+"��ѧ��:"+stuNo+",�༶:"+clazz);		
	}
}