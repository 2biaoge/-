/*
��1--ĳ����֮����Ա�7���������ĸ���
*/
public class Demo15{
	public static void main(String[] args){
		int r=getCount(100);
		System.out.println("1-100�ܱ�7�����ĸ�����:"+r);
	}	
	//��1--ĳ����֮����Ա�7���������ĸ���
	public static int getCount(int n){
		int count=0;//������
		for(int i=1;i<=n;i++){
			if(i%7==0){
				count++;
			}
		}

		return count;//���ؽ������������
	}
}