/*
7.��ӡ2��10000������������ÿ����ʾ8������

���� �� ���� ��ֻ�ܱ�1������������������������  2  3  5   50
        ����   4  6  8  9 10
*/

public class Demo7{
	public static void main(String[] args){	
		for(int i=2;i<=100;i++){
			boolean isPrime=true;//�������еĶ���
			for(int k=2;k<i;k++){
				if(i%k==0){
					isPrime=false;
					break;	
				}
			}	
			if(isPrime){
				System.out.println(i+"������");
			}
		}
	}
}