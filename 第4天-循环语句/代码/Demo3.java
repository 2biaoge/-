/*
��ϰ��:��1-100�ĺ�
1+2+3+4+....+100
*/
public class Demo3{
	public static void main(String[] args){
		//1��ʼ������
		int i=1;
		int sum=0;//�����
		//2ѭ������
		while(i<=100){
			sum=sum+i;	
			i++;
		}
		System.out.println("1-100�ĺ���:"+sum);
		
	}
}