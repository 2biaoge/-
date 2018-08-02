/*
使用方法打印4次九九乘法表
*/
public class Demo4{
	public static void main(String[] args){
		chengfa();
		chengfa();
		chengfa();
		chengfa();
		//调用add();
		add(10,20);//自动类型转换
	}
	public static void chengfa(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}
	
	public static void add(double d1,double d2){
		System.out.println(d1+d2);	
	}	
	
}