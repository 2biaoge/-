/*
����ѧ��������
*/
public class TestManager{
	public static void main(String[] args){	
		//1����������
		QFStudentManager m=new QFStudentManager();
		//2���뷽��
		QFStudent s=m.inputStudent();
		m.modify(s);
	
	}
}