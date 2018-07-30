/*
我想买车，买什么车决定于我在银行有多少存款

如果我的存款超过500万，
我就买保时捷

否则，如果我的存款超过100万，我就买宝马

否则， 
如果我的存款超过50万，我就买帕萨特

否则， 
如果我的存款超过10万，我就买qq

否则， 
如果我的存款10万以下 ，我买捷安特

*/
public class Demo7{
	public static void main(String[] args){
		int money=200;
		if(money>=500){
			System.out.println("买保时捷");
		}else if(money>=100){
			System.out.println("买宝马");
		}else if(money>=50){
			System.out.println("买帕沙特");
		}else if(money>=10){
			System.out.println("买个吉利");
		}else{
			System.out.println("买个捷安特");
		}
	}
}