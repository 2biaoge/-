/*
Ҫ�󣺼���������λ���ֵĻ�Ա���ţ�ʹ�á�/���͡�%��������ֽ��û�Ա������λ�ϵ����֣�������λ���������
*/
public class Demo4{
	public static void main(String[] args){
		int card=5739;
		int ge=card%10;
		int shi=card/10%10;
		int bai=card/100%10;
		int qian=card/1000;
		int sum=ge+shi+bai+qian;
		System.out.println(sum);
		
	}
}