/*
练习： 打印100以内 能被4整除不到能被7整除的数据，每行打印6个
*/

public class Demo1{
	public static void main(String[] args){
		int count=0;//计算器
		for(int i=0;i<=100;i++){
			if(i%4==0&&i%7!=0){
				System.out.print(i+" ");	
				count++;
				if(count==6){
					System.out.println();
					count=0;
				}			

			}
		}	
	}
}

