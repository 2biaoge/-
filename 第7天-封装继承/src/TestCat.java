public class TestCat{
	public static void main(String[]args){
		Cat mao1=new Cat();

		mao1.show("Tom",8,"��ɫ");

		Cat mao2=new Cat("����",6,"��ɫ");

		Cat mao3=new Cat();
		//mao3.nickname="����";
		//mao3.age=678;
		//mao3.color="���˰���";

		/*
		mao3.setNickname("����");
		mao3.setAge(66);
		mao3.setColor("���˰���");
		String nickname = mao3.getNickname();
		int age =mao3.getAge();
		String color=mao3.getColor();
		*/
			//System.out.println("��ֻ"+color+"��è��"+nickname+"����"+age+"�ꡣ");

		mao3.show("�ϰ�",88,"��ɫ");
	}
		
}