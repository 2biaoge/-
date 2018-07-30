import java.util.Scanner;						//导入Scanner类
public class ZhongJiang{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);			//创建input对象
			System.out.println("中奖了么？（中了/没中）");	//提示
		String a = input.next();				//输入字符串
		if (a.equals("中了")){					//判断字符串是否正确	(选择)
			System.out.println("去挥霍！！！");
			int b;
			int c;

			System.out.println("中了多少钱？（单位：万）");
			c = input.nextInt();

			System.out.println("买房买车？\n买房输入1，买车输入2，存银行输入3");
			b = input.nextInt();

			if(b==1){
				System.out.println("买房");

				if(c>=1000){
					System.out.println(c+"万:	三环里买");
				}else if(c>=500){
					System.out.println(c+"万：	三环外买");
				}else if(c>=20){
					System.out.println(c+"万：	出北京买");
				}else{
					System.out.println(c+"万：	钱不够，哪也买不了");
				}
		

			}else if(b==2){
				System.out.println("买车");
				if(c>=100){
					System.out.println(c+"万：	买豪车");
				
				}else if(c>=20){
					System.out.println(c+"万：	买伪豪车");
				}else{
					System.out.println(c+"万：	买自行车");
				}
			}else if(b==3){
				System.out.println("存银行");
				System.out.println("是否全部存银行？（是/否）");
			
				String e = input.next();
					if (e.equals("是")){
						System.out.println(c+"万：	全部存进银行产生利息。");
					}else if (e.equals("否")){
						System.out.println("存多少？(单位：万元)");
						int f =input.nextInt();
	
						if(f>c){
							System.out.println("输入的金额>中奖金额：");
						}else if(f>=0){
							System.out.println("奖金："+c+"万元");
							System.out.println("存入："+f+"万元");
							System.out.println("剩余："+(c-f)+"万元");
						}else{
							System.out.println("输入金额不个合法。");
						}
							
					}else{
						System.out.println("输入有误！");
					}
				
			
				


			}else{
				System.out.println("输入有误");
			}



		}else if (a.equals("没中")){			
			System.out.println("下海干活！！！还买不买彩票？");
				System.out.println("请输入：买/不买");

			String d = input.next();
			if (d.equals("买")){
				System.out.println("有可能会中奖");
			}else if(d.equals("不买")){
				System.out.println("不买就继续干活！");
			}else{
				System.out.println("输入错误。。。");
			}
					

		}else{
			System.out.println("输入错误！！！");
		}
	}
	

}