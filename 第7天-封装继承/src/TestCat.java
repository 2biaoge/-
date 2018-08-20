public class TestCat{
	public static void main(String[]args){
		Cat mao1=new Cat();

		mao1.show("Tom",8,"蓝色");

		Cat mao2=new Cat("老六",6,"红色");

		Cat mao3=new Cat();
		//mao3.nickname="三哥";
		//mao3.age=678;
		//mao3.color="黑了吧唧";

		/*
		mao3.setNickname("三哥");
		mao3.setAge(66);
		mao3.setColor("黑了吧唧");
		String nickname = mao3.getNickname();
		int age =mao3.getAge();
		String color=mao3.getColor();
		*/
			//System.out.println("这只"+color+"的猫叫"+nickname+"今年"+age+"岁。");

		mao3.show("老板",88,"绿色");
	}
		
}