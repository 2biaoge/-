
import java.util.Scanner;
public class LianXi1{
	public static void main( String[] args){
		Scanner input = new Scanner(System.in);
		
		double c;
		
		do{
		System.out.println("������ɼ���");
		c= input.nextInt();	
		if(80>c & c>=60){
			System.out.println("����");}
		else if(90>c & c>=80){
			System.out.println("�е�");}
		else if(100>=c & c>=90){
			System.out.println("����");}
		else if(0<=c & c<60){
			System.out.println("������");}
		else{
			System.out.println("�������Ϸ�������");}

		}while(c!=00);
			System.out.println("����00����رգ�����");
			
			//input.close();   ???????????
	}

}

			//��do{  }ѭ�������룿
			//����ѭ����c��=00����