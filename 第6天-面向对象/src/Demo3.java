//创建对象。。。。。。。。。。。。调用方法

public class Demo3{
	public static void main(String[]args){
		Person person=new Person();
		person.laoShi();
		Person person2=new Person();
		person2.xueSheng();			//调用无参方法
		
		person2.xiaoHong("小红",19);		//调用带参方法
			

		Person person3=new Person("马冬梅");//构造方法自动调用
		
	}
}