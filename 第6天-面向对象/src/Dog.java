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
	
		System.out.println("这只狗叫"+nickname);
	}
	public void jieshaodog(){
		color="黄色的";
		nickname="宠物狗caicai";
		System.out.println(color+nickname+gongneng);
	}

	public void zhu(){
		Person p1=new Person();
		p1.name="王兰";
		p1.xingwei="她哭着发寻猪启示";
		nickname="笨笨";
		color="黑色";
		System.out.println(p1.name+"家的"+color+nickname+"走丢了"+p1.xingwei);
	}
}