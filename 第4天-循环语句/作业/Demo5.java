/*
��Ԫ�ټ����⣺����5Ԫһֻ��ĸ��3Ԫһֻ��3ֻС��1Ԫ�������100ԪǮ����100ֻ����
���ܲ�Ƿ�������򹫼���ĸ����С����������ֻ��
*/
public class Demo5{
	public static void main(String[] args){
		for(int x=0;x<=20;x++){
			for(int y=0;y<=33;y++){
				if(7*x+4*y==100){
					System.out.println("����:"+x+" ĸ��:"+y+" С��:"+(100-x-y) );
				}	
			}
		}	
	}
}