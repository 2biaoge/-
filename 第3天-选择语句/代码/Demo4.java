/*
�ϻ���ϰ1�����Ʊ

����������500�����򳵡��򷿡���������

���û�У�������

*/
import java.util.Scanner;
public class Demo4{
	public static void main(String[] args){
		//1����input����
		Scanner input=new Scanner(System.in);
		//2��ʾ
		System.out.println("��500����?Y/N");
		String answer=input.next();
		//3�ж�
		if(answer.equals("y")){  //�ַ������ж�ʹ��equals���� 
			System.out.println("�򷿡��򳵡�ŷ������...");	
		}else{
			System.out.println("������....");
		}  	
	}
}

