/*
break在循环中的使用
 如果i遇到8结束循环
*/
public class Demo4{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			if(i==8){
				break;	
			}
			System.out.println(i);
		}
	}
}