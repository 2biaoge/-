/*
*
***
*****
*******
*********


     *
    ***
   *****
  *******
 *********
*/
public class Demo17{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			//�ո�
			for(int k=1;k<=5-i;k++){
				System.out.print(" ");	
			}
			//�Ǻ�
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}