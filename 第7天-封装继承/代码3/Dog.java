/*
������̳�Animal
*/
public class Dog extends Animal{
	int love;//

	public Dog(){
		super();//ʡ�� �޲ι��췽��
		System.out.println("�����޲ι���ִ����...");
	}
	public Dog(String nickname,String color){
		super(nickname,color);//����Ĵ��ι���
		System.out.println("�������ι���ִ����...");	
	}

	public void lookHome(){	
		System.out.println(super.nickname+"����...���ܶ�:"+this.love);
		super.print();
		
	}
	
}
