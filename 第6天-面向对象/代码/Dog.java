/*
Dog
 ���ԣ�
   �ǳ�
   Ʒ��
   ��ɫ
   ����
 ����:
    ����
    ��ʾ��Ϣ
    ��ˣ
*/
public class Dog{
	//�ǳ�
	String nickname;
	//Ʒ��
	String strain;
	//��ɫ
	String color;
	//����
	int age;
	//�޲ι��췽��
	public Dog(){
		//System.out.println("�޲ι��췽��ִ����....");
	}
	//���ι��췽��
	public Dog(String _nickname,String _strain){
		nickname=_nickname;//��_nickname��ֵ��ֵ��nickname
		strain=_strain;//��_strain��ֵ��ֵ��strain;
	}

	
	//����
	public void workHome(){
		System.out.println(nickname+"���㿴��");	
	}	
	public void show(){
		System.out.println("�ǳ�:"+nickname+" Ʒ��:"+strain+" ��ɫ:"+color+", ���䣺"+age);
	}
	public void play(){
		System.out.println("���˺͹�������ˣ.....");
	}
 
}