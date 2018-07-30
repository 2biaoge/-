/*
break在循环中的使用
*/
public class Demo3{
	public static void main(String[] args){
		for(int i=1;i<3;i++){
			for(int j=1;j<5;j++){
				if(j==2){
					break;
				}
				System.out.println(i+" "+j);
			}
		}
	}
}