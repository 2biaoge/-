/*
continue����ѭ���е�ʹ�� 
���ã���������ѭ����������һ��ѭ��
Ҫ��ѭ��1-10������4�ı�������ӡ
*/
public class Demo7{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			if(i%4==0){
				continue;
			}
			System.out.println(i);
		}
	}
}