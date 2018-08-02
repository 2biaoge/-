/*
求1--某个数之间可以被7整除的数的个数
*/
public class Demo15{
	public static void main(String[] args){
		int r=getCount(100);
		System.out.println("1-100能被7整除的个数是:"+r);
	}	
	//求1--某个数之间可以被7整除的数的个数
	public static int getCount(int n){
		int count=0;//计算器
		for(int i=1;i<=n;i++){
			if(i%7==0){
				count++;
			}
		}

		return count;//返回结果，结束方法
	}
}