/*
1.��1��1000֮�����㡰��3����2����5����3����7����2����������һ��ֻ��ӡ5����
*/

public class ZuoYe1{
	public static void main(String[]args){

		int a=0;
		for(int i=1;i<=10000;i++){
			if(i%3==2&&i%5==3&&i%7==2){
				System.out.print(i+"\t");
				a++;
				if(a==5){
					System.out.println();
					a=0;
				}
			}	
		}
	}
}