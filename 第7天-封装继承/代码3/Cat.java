/*
è��̳ж���
*/
public class Cat extends Animal{
	String hobby;

	public Cat(){
		super();
		System.out.println("è����޲ι���ִ����...");
	}
		
	public void play(){
		System.out.println(super.nickname+"��"+this.hobby);
		super.print();
	}
}