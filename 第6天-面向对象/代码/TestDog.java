/*
����Dog��
*/
public class TestDog{
	public static void main(String[] args){
		//1����dog���� new Dog(); ���ٿռ䣬���ù��췽����������
		Dog wangcai=new Dog();
		//2���Ը�ֵ
		wangcai.nickname="����";
		wangcai.strain="��ʿ��";
		wangcai.color="�Ұ�ɫ";
		wangcai.age=3;
		//3���÷���
		wangcai.play();
		wangcai.show();
		wangcai.workHome();

		//4��������
		Dog laifu=new Dog("����","��������");
		laifu.age=5;
		laifu.color="��ɫ";
		//5���÷���
		laifu.play();
		laifu.show();
		laifu.workHome();
		
	}

}