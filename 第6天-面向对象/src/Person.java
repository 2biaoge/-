public class Person{
	String name;
	int age;
	String gender;
	String where;
	String xingwei;
	String shenfen;

	//�޲ι��췽���Զ����ɣ���һ��������������вι��췽����Ҫ�����޲ι��췽���������޲ι��췽���Զ�����ʱ�ᱨ��ʵ���б���β��б��Ȳ�ͬ��
	public Person(){
	}

	
	public void xingWei(){		//�޲���ͨ��������Ҫ�ڶ����е��ã������з���ֵ���͡�
	where="�ڹ�԰";
	Dog dog =new Dog();		//�ڷ����ﴴ������
	dog.nickname="����";
		System.out.println(name+where+"��"+dog.nickname);
	}		//�ڱ��෽����ʹ�ñ�������ֱ��ʹ��: name  
			//�ڱ��෽����ʹ��������������Ҫ�������������������ƣ�dog.nickname
	
	public void laoShi(){
		name="����";
		System.out.println(name+"������Ľ���");
	
	}
	public	void xueSheng(){
		name ="С��";
		System.out.println(name+"��������������ʼ�");
	}
	public void xiaoHong(String m,int n){	//������ͨ����������βθ�ֵ��ʼ������ʱ����ʵ��
		name=m;
		age=n;
		System.out.println(name+"����"+age+"��");
	}
	public Person(String mm){			//���ι��췽����ע�ⴴ������ʱ��������Ĺ��췽��
		name=mm;
		System.out.println("�������"+name);
	}
	public void aYi(String a,String w,String x){
	name=a;
	where=w;
	xingwei=x;
	System.out.println(a+w+x);
	}
	public Person(String mm,String nn){
		name=mm;
		shenfen=nn;
		System.out.println("�������"+shenfen+name);
		
	}
	
}