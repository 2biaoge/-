public class Student extends Person{
	String school;

	public void study(){
		System.out.println(name+"��"+school+"ѧϰjava");
	}

	public String getInfo(){
		return "������"+name+"\t���䣺"+age+"\t�������ڣ�"+born+"����"+school;
	}

}