/*
��do/whileʵ�ִ�ӡ100���ڵ�����
*/
public class Demo7{
	public static void main(String[] args){
		//1��ʼ������
		int j=1;
		do{
			/*
			System.out.println(j);
			j+=2;
			*/
			if(j%2!=0){
				System.out.println(j);
			}
			j++;
		}while(j<=100);
	}
}