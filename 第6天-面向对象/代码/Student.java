/*
ѧ����
// ����
name
age
hobby

//����
introduce();
dance();
sing();
lie();
*/
public class Student{
	String name;//����
	int age;//����
	String hobby;//����
		
	//���ҽ���
	public void introduce(){
		System.out.println("��Һã�����"+name+",����:"+age+",����:"+hobby);	
	}
	//����
	public void dance(){
		System.out.println(name+"��һ�ι㳡��");	
	}
	//����
	public void sing(){
		System.out.println(name+"��һ������");
	}
	//��ţƤ
	public void lie(){
		System.out.println(name+"��һ�ζ���...");
	}
	
}