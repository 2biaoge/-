/*
100 �����ܹ���3����  ���ǲ��ܱ�5����������ӡ���
*/
public class Demo8{
	public static void main(String[] args){
		//1��ʼ������
		int z=0;
		do{
			if(z%3==0&&z%5!=0){
				System.out.println(z);
			}
			z++;
		}while(z<=100);
	}
}