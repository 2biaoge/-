import java.util.Scanner;
public class Text{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		String e = input.next();
		if (e.equals("��")){
			System.out.println("ȫ��������в�����Ϣ��");
		}else if (e.equals("��")){
			System.out.println("����٣�");
			int f =input.nextInt();
	
			if(f>10){
				System.out.println("����Ľ��>�н���");
			}else if(f>=0){
				System.out.println("");
				System.out.println("");
				System.out.println("��Ԫ");
			}else{
				System.out.println("��������Ϸ���");
			}
							
		}else{
			System.out.println("��������");
		}
	}
}