/*
++ ����
-- �Լ�
*/

public class Demo2{
	public static void main(String[] args){
		int num=10;
		//num++;// num����1
		//++num; //num����1

		//int num2=num++; // num��ֵ��ֵ��num2,Ȼ��num����1
		int num2=++num; //num������1 ��Ȼ��num��ֵ��num2
		System.out.println(num2);

	
		int n=5;
		//int n2=n--; //n�ȸ�ֵ��n2,Ȼ��n��1
		int n2=--n;
		System.out.println(n2);
		System.out.println(n);
		
	}
}
