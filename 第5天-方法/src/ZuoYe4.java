import java.util.Scanner;
public class ZuoYe4{
	
	public static void main(String[]args){
		int g=ge();
		System.out.println(g);
	}
	//�Ӽ�������һ����n���ж��ǲ���һ��������������ֻ�ܱ�1��������������������	

	public static int ge(){
		System.out.println("����n�����ж������ĸ���   n=:");
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int count=0;
		for(int a=1;a<=n;a++){
			boolean isPrime=true;//�������ж���
				for(int k=2;k<a;k++){
					if(a%k==0){
						isPrime=false;
						break;
					}
				}
				if(isPrime){
					count+=1;
				}
		}
		return count;
	}
}