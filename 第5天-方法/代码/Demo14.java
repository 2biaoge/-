/*
1 ���100~200֮���ܱ�3��������

2 �ж�һ�������Ƿ�������
*/
public class Demo14{
	public static void main(String[] args){
		//����
		method1();

		method2(53);
	}
	//���100~200֮���ܱ�3��������
	public static void method1(){
		for(int i=100;i<=200;i++){
			if(i%3==0){
				System.out.println(i);
			}
		}
	}
	//�ж�һ�������Ƿ�������
	public static void method2(int num){
		boolean isPrime=true;//���綼������
		for(int i=2;i<num;i++){
			if(num%i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			System.out.println(num+"������");
		}else{
			System.out.println(num+"��������");
		}
		
	}

	
}