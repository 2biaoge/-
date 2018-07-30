/*
1.求1至1000之间满足“用3除余2；用5除余3；用7除余2”的数，且一行只打印5个数
*/
public class Demo1{
	public static void main(String[] args){
		int count=0;
		for(int i=1;i<=1000;i++){
			if(i%3==2&&i%5==3&&i%7==2){
				System.out.print(i+" ");
				count++;
				if(count==5){
					System.out.println();
					count=0;
				}
			}
		}
	}
}