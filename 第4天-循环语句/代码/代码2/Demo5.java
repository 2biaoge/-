/*
使用break 跳出循环
*/
public class Demo5{
	public static void main(String[] args){
		out : 
		for(int i=1;i<3;i++){
			for(int j=1;j<5;j++){	
				if(j==2){
					break out;	
				}	
				System.out.println(i+" "+j);
			}

		}

                 
	}
}