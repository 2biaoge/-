/*
 ʹ��Person��
  
  ���ͷ�Ϊ�����ࣺ
		�������� ����������
		��������
		�������ͣ� ��  ����  �ӿ� ö��
*/
public class Demo1{
	public static void main(String[] args){
		//1ʹ��Person�ഴ��һ������
		Person liangliang=new Person();
		Person meimei=new Person();
		//2��liangliang��ֵ����
		liangliang.name="����";
		meimei.name="����";
		//3����liangliang�ķ���
		liangliang.eat();
		liangliang.speak();
		meimei.eat();
		meimei.speak();
		
		//���Ҫ��������һ�����еľ�̬��Ա�����;�̬���� ����.��̬��Ա����  ����.��̬������
		//Person.country="�й�";	
		//Person.hi();
		

	}
}