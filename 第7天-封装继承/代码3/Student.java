/*
Student

��д����
1 ����������͸������ͬ
2 �����б����͸�����ͬ
3 ����ֵ����͸�����ͬ(��1.7 ����ֵ���ͺ͸������)
4 ����Ȩ�޲��ܱȸ����ϸ�
*/
public class Student extends Person{
	
	String school;//ѧУ

	
	public void study(){
		System.out.println(name+"�ú�ѧϰ����������");
	}

	public String getInfo(){
		return "����:"+name+",����:"+age+",��������:"+bornDate+" ѧУ:"+school;
	}
	
	
}