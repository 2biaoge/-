/*
�������ʹ���
*/
public class Demo2{
	public static void main(String[] args){
		//1����ѧ��
		Student liangliang=new Student();
		liangliang.age=20;
		System.out.println("�޸�֮ǰ:"+liangliang.age);
		change(liangliang);
		System.out.println("�޸�֮��:"+liangliang.age);
	}
	//�ı�
	public static void change(Student s){  //�������ʹ��ݲ���
		s.age=25;
		System.out.println(s.age+"----------");
	}
}