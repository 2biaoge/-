/*
������
*/
public class Animal{
	String nickname;
	String color;
	String strain;

	public Animal(){
		System.out.println("Animal���޲ι���ִ����....");	
	}
	public Animal(String nickname,String color){
		this.nickname=nickname;
		this.color=color;
		System.out.println("Animal���εĹ��췽��");
	}
	
	public void print(){
		System.out.println("�ǳ�:"+nickname+" ��ɫ:"+color+" Ʒ��:"+strain);
	}
}