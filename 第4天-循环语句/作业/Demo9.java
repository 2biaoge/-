/*
开发一个标题为"FilpFlop"的游戏程序。它从1计数到100，遇到3的倍数就替换为单词Filp,5的倍数就替换为单词Flop,
既为3的倍数又为5的倍数则替换单词FilpFlop.
*/
public class Demo9{
	public static void main(String[] args){	
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FilpFlop");	
			}else if(i%3==0){
				System.out.println("Filp");	
			}else if(i%5==0){
				System.out.println("Flop");
			}else{ 
				System.out.println(i);	
			}	
		}	
	}
}