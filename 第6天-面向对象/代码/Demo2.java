/*
Demo2
*/
public class Demo2{
	
	String str="hello world";//��Ա���� 
	static int num=100; //��̬��Ա����
	
	public static void main(String[] args){
		//System.out.println(str);//�ھ�̬�����в��ܷ��ʷǾ�̬�ĳ�Ա����
		System.out.println(num);//�ھ�̬�������ܷ��ʾ�̬��Ա����
		//����
		show();
		//hi(); //�ھ�̬�������ܷ��ʷǾ�̬�ķ���
		int num=200; //�ֲ����� ,�����Ա�����;ֲ�����������ͬ���ֲ��������ȼ���
		System.out.println(num);
		
	}
	//��̬�ķ���
	public static void show(){ 
		System.out.println(num);
	}
	//�Ǿ�̬�ķ���
	public void hi(){
		System.out.println("���к�"+str);
		show(); // �ڷǾ�̬�������ܷ��ʾ�̬�ķ���
	}
}