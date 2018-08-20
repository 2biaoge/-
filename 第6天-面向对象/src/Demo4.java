public class Demo4{
	public static void main(String[]args){
		Person ayi1=new Person();
		Person ayi2=new Person();
		ayi1.name="张阿姨";
		ayi1.where="在华联超市";
		ayi1.xingwei="买红富士";
		System.out.println(ayi1.name+ayi1.where+ayi1.xingwei);

		ayi2.aYi("李阿姨","在华联超市","买绿富士");

		System.out.println(ayi1.name+"和"+ayi2.name+ayi1.where+ayi1.xingwei);
	}
}