/*
������
*/
public class RichMan{
	//����
	public String name;
	//�Ƿ���Ǯ
	public boolean hasMoney;
	
	public RichMan(){
	}
	public RichMan(String n,boolean h){
		name=n;
		hasMoney=h;	
	}

	public void drive(){
		Car c=new Car();
		c.brand="����";
		c.color="��ɫ";
		System.out.println(name+"����"+c.brand+"������...");	
	}

	public void show(){
		Car c=new Car("����","��ɫ");
		
		GirlFriend feng=new GirlFriend("���");
		System.out.println(name+"��"+feng.name+"��ҫ"+c.brand+"������");
		
	}

	
}