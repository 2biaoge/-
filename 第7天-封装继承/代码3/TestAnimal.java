public class TestAnimal{
	public static void main(String[] args){
		Dog wangcai=new Dog("����","��ɫ");
		wangcai.strain="��ë";
		wangcai.love=90;
		wangcai.print();
		wangcai.lookHome();

		Cat xiaolaohu=new Cat();
		xiaolaohu.nickname="С�ϻ�";
		xiaolaohu.color="��ɫ";
		xiaolaohu.strain="��˹è";
		xiaolaohu.hobby="����";
		xiaolaohu.print();
		xiaolaohu.play();
	}
}