/*
������
*/
public class TestStudent{
	public static void main(String[] args){
		//1��������
		Student yangguo=new Student();//�����޲εĹ��췽��
		Student xiaolongnv=new Student("С��Ů",1010); //�����вεĹ��췽��
		Student meichaofeng=new Student("÷����",1020,"bj1802003");
		yangguo.name="����";
		yangguo.age=1000;
		yangguo.stuNo="bj1802001";
		yangguo.clazz="java_bj1802";
		
		yangguo.show();
		for(int i=0;i<5;i++){
			yangguo.study();
		}
		
		yangguo.eat();
		yangguo.sleep();

		xiaolongnv.study();
		meichaofeng.show();
		
	}
}