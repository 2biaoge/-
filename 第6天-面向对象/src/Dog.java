public class Dog{
	String nickname;
	String color;
	String gongneng;

	public Dog(){

	}
	
	public Dog(String _nickname){
		nickname=_nickname;

	}
	public void dogName(){
	
		System.out.println("��ֻ����"+nickname);
	}
	public void jieshaodog(){
		color="��ɫ��";
		nickname="���ﹷcaicai";
		System.out.println(color+nickname+gongneng);
	}

	public void zhu(){
		Person p1=new Person();
		p1.name="����";
		p1.xingwei="�����ŷ�Ѱ����ʾ";
		nickname="����";
		color="��ɫ";
		System.out.println(p1.name+"�ҵ�"+color+nickname+"�߶���"+p1.xingwei);
	}
}