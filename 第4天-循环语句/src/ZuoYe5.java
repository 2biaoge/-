
/*
百元百鸡问题：公鸡5元一只，母鸡3元一只，3只小鸡1元，如果用100元钱，买100只鸡，
不佘不欠，可以买公鸡，母鸡，小鸡，各多少只。
*/
public class ZuoYe5{
	public static void main(String[]args){
		int x=0;
		int y=0;
		int z=0;
		z=100-x-y;
		for(x=0;x<=20;x++){
			for(y=0;y<=33;y++){
				if(7*x==4*y){
					System.out.println("公鸡:"+x+" 母鸡:"+y+" 小鸡:"+(100-x-y) );
				}
					
			}
		}
		
	}
}