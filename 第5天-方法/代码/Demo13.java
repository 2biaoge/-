/*
ʹ�õݹ�ʵ��1-100�ĺ�
*/
public class Demo13{
	public static void main(String[] args){	
		int r=sum(100);
		System.out.println(r);	
	}
	public static int sum(int n){
		if(n==1){
			return 1;
		}
		return sum(n-1)+n;
	}
}