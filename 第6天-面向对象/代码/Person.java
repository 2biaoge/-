/*
����
  ����:  java��ʹ�ó�Ա������ʾ (����)
  ����
  ����
  �Ա�
  ���
  ����
  ����: java��ʹ�÷�������ʾ 
   ��
   ��
   ˯
   ��	
   ˵
*/
public class Person{
	String name;//����
	int age; //����
	String gender;//�Ա�
	double height;//���
	double weight;//����
	static String country; //��̬�ĳ�Ա����

	//��
	public void eat(){
		System.out.println(name+"������...");	
	}
	//˵
	public void speak(){
		System.out.println(name+"˵������һ����.....");
	}
	public static void hi(){
		System.out.println("������:"+country);
	}

	
}