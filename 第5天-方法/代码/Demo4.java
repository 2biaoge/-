/*
ʹ�÷�����ӡ4�ξžų˷���
*/
public class Demo4{
	public static void main(String[] args){
		chengfa();
		chengfa();
		chengfa();
		chengfa();
		//����add();
		add(10,20);//�Զ�����ת��
	}
	public static void chengfa(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}
	
	public static void add(double d1,double d2){
		System.out.println(d1+d2);	
	}	
	
}