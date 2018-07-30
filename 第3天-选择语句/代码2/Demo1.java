/*
switch的使用
1 switch 类型 byte short int char  String  枚举
2 case 常量不能重复
3 default 可以省略
4 break 不要忘记写，如果省略会出现case 穿透
*/
public class Demo1{
	public static void main(String[] args){
		byte num=4;
		char c='1';
		String s="88";
		switch(s){ // byte  short  int char  
			
			case "11":
				System.out.println("爬长城");
				break;
			case "22":
				System.out.println("逛故宫");
				break;
			case "33":
				System.out.println("看天安门");
				break;
			case "55":
				System.out.println("去颐和园");
				break;
			default:
				System.out.println("在家睡觉...");
				break;
			
		}

		System.out.println("switch结束了");
	}
}