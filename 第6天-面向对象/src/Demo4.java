public class Demo4{
	public static void main(String[]args){
		Person ayi1=new Person();
		Person ayi2=new Person();
		ayi1.name="�Ű���";
		ayi1.where="�ڻ�������";
		ayi1.xingwei="��츻ʿ";
		System.out.println(ayi1.name+ayi1.where+ayi1.xingwei);

		ayi2.aYi("���","�ڻ�������","���̸�ʿ");

		System.out.println(ayi1.name+"��"+ayi2.name+ayi1.where+ayi1.xingwei);
	}
}