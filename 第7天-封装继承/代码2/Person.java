/*
Person
*/
public class Person{
	//���� ˽�е�
        private String name;
	private int age;//�ں���Χ֮�ڲ������� 1-120

	//��ȡname
	public String getName(){
		return name;
	}
	//����name
	public void setName(String name){
		this.name=name;	
	}
	//��ȡage
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if(age<1||age>120){
			this.age=18;
		}else{
			this.age=age;
		}
	}


	public void show(){
		System.out.println("����:"+name+",����:"+age);	
	}
}