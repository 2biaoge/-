import java.util.Scanner;

public class LianXi2{
	public static void main (String[]args){
		String a ="����";
		String b ="ƽ��";
		
		int nian;
	
do{
	
	Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ����ݣ�");

		nian =input.nextInt();	//��ʼ��������nian

	
			int c=0;
		if ((c==nian%4&&c!=nian%100)||(c==nian%400)){

			System.out.println(a);}
		else{  System.out.println(b);}
}while(nian!=0000);
	System.out.println("����0000��������");
	

		
	}
}


