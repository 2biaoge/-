public class Cat{
	private String nickname;
	private int age;
	private String color;

	static{
		System.out.println("��̬�����.......������");
	}
	
	{
		System.out.println("��̬�����=�������鱻ִ��\n������������");
	}

	
	public String getNickname(){
		return nickname;
	}
	public void setNickname(String nickname){
		this.nickname=nickname;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age =age;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}

	public Cat(){
	System.out.println("�޲ι��췽����ִ�С�����������������");
	}
	public void show(String nickname,int age,String color){
		this.nickname=nickname;// /////////////////////////////////////////////////////////
		this.age=age;
		this.color=color;
			System.out.println("��ֻ"+color+"��è��"+nickname+"����"+age+"��");
	}
	public Cat(String nickname,int age,String color){
		this.nickname=nickname;
		this.age=age;
		this.color=color;
			System.out.println("��ֻ"+color+"��è��"+nickname+"����"+age+"���ˡ�lelele\n"+"���ι��췽����ִ�С�������");
	}	
	
}