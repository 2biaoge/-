/*
switch��ʹ��
1 switch ���� byte short int char  String  ö��
2 case ���������ظ�
3 default ����ʡ��
4 break ��Ҫ����д�����ʡ�Ի����case ��͸
*/
public class Demo1{
	public static void main(String[] args){
		byte num=4;
		char c='1';
		String s="88";
		switch(s){ // byte  short  int char  
			
			case "11":
				System.out.println("������");
				break;
			case "22":
				System.out.println("��ʹ�");
				break;
			case "33":
				System.out.println("���찲��");
				break;
			case "55":
				System.out.println("ȥ�ú�԰");
				break;
			default:
				System.out.println("�ڼ�˯��...");
				break;
			
		}

		System.out.println("switch������");
	}
}