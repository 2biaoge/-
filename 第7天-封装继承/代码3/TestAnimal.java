public class TestAnimal{
	public static void main(String[] args){
		Dog wangcai=new Dog("旺财","黄色");
		wangcai.strain="金毛";
		wangcai.love=90;
		wangcai.print();
		wangcai.lookHome();

		Cat xiaolaohu=new Cat();
		xiaolaohu.nickname="小老虎";
		xiaolaohu.color="花色";
		xiaolaohu.strain="波斯猫";
		xiaolaohu.hobby="爬树";
		xiaolaohu.print();
		xiaolaohu.play();
	}
}