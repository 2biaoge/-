/*
��ӡ100���� �ܱ�4���������ܱ�7���������ݣ�ÿ�д�ӡ6��
*/
public class Demo10{
	public static void main(String[] args){
		
		int count=0;//������

		for(int i=0;i<=100;i++){
			if(i%4==0&&i%7!=0){
				System.out.print(i+" ");
				count++;	
				if(count==6){
					System.out.println();
					count=0;//count�ڸ�ֵΪ0,���¿�ʼ����
				}
			}
		}
	
	}
}