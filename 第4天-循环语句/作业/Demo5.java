/*
百元百鸡问题：公鸡5元一只，母鸡3元一只，3只小鸡1元，如果用100元钱，买100只鸡，
不佘不欠，可以买公鸡，母鸡，小鸡，各多少只。
*/
public class Demo5{
	public static void main(String[] args){
		for(int x=0;x<=20;x++){
			for(int y=0;y<=33;y++){
				if(7*x+4*y==100){
					System.out.println("公鸡:"+x+" 母鸡:"+y+" 小鸡:"+(100-x-y) );
				}	
			}
		}	
	}
}