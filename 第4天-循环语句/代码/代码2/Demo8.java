/*
continue在二重循环中的使用
*/
public class Demo8{
	public static void main(String[] args){
		for(int i=1;i<4;i++){
			for(int j=1;j<4;j++){
				if(j==2){
					continue;
				}
				System.out.println(i+" "+j);
			}
			
		}
	
	}
}