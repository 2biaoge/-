/*
��ӡ�����еġ�ˮ�ɻ���������ν��ˮ�ɻ�������ָһ����λ�������λ���������͵��ڸ�������
*/
public class Demo3{
	public static void main(String[] args){
		for(int i=100;i<=999;i++){
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/100;
			int n=ge*ge*ge+shi*shi*shi+bai*bai*bai;
			//double n=Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3);
			if(i==n){
				System.out.println(i);
			}
		}
	}
}