/*
����һ������Ϊ"FilpFlop"����Ϸ��������1������100������3�ı������滻Ϊ����Filp,5�ı������滻Ϊ����Flop,
��Ϊ3�ı�����Ϊ5�ı������滻����FilpFlop.
*/
public class Demo9{
	public static void main(String[] args){	
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FilpFlop");	
			}else if(i%3==0){
				System.out.println("Filp");	
			}else if(i%5==0){
				System.out.println("Flop");
			}else{ 
				System.out.println(i);	
			}	
		}	
	}
}