/*
continue�ڶ���ѭ���е�ʹ��
�˽�
*/
public class Demo9{
	public static void main(String[] args){
		out :
		for(int i=1;i<4;i++){
			for(int j=1;j<4;j++){
				if(j==2){
					continue out;
				}
				System.out.println(i+" "+j);
			}
			
		}
	
	}
}