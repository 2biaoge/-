import java.util.Scanner;						//����Scanner��
public class ZhongJiang{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);			//����input����
			System.out.println("�н���ô��������/û�У�");	//��ʾ
		String a = input.next();				//�����ַ���
		if (a.equals("����")){					//�ж��ַ����Ƿ���ȷ	(ѡ��)
			System.out.println("ȥ�ӻ�������");
			int b;
			int c;

			System.out.println("���˶���Ǯ������λ����");
			c = input.nextInt();

			System.out.println("���򳵣�\n������1��������2������������3");
			b = input.nextInt();

			if(b==1){
				System.out.println("��");

				if(c>=1000){
					System.out.println(c+"��:	��������");
				}else if(c>=500){
					System.out.println(c+"��	��������");
				}else if(c>=20){
					System.out.println(c+"��	��������");
				}else{
					System.out.println(c+"��	Ǯ��������Ҳ����");
				}
		

			}else if(b==2){
				System.out.println("��");
				if(c>=100){
					System.out.println(c+"��	�����");
				
				}else if(c>=20){
					System.out.println(c+"��	��α����");
				}else{
					System.out.println(c+"��	�����г�");
				}
			}else if(b==3){
				System.out.println("������");
				System.out.println("�Ƿ�ȫ�������У�����/��");
			
				String e = input.next();
					if (e.equals("��")){
						System.out.println(c+"��	ȫ��������в�����Ϣ��");
					}else if (e.equals("��")){
						System.out.println("����٣�(��λ����Ԫ)");
						int f =input.nextInt();
	
						if(f>c){
							System.out.println("����Ľ��>�н���");
						}else if(f>=0){
							System.out.println("����"+c+"��Ԫ");
							System.out.println("���룺"+f+"��Ԫ");
							System.out.println("ʣ�ࣺ"+(c-f)+"��Ԫ");
						}else{
							System.out.println("��������Ϸ���");
						}
							
					}else{
						System.out.println("��������");
					}
				
			
				


			}else{
				System.out.println("��������");
			}



		}else if (a.equals("û��")){			
			System.out.println("�º��ɻ�����������Ʊ��");
				System.out.println("�����룺��/����");

			String d = input.next();
			if (d.equals("��")){
				System.out.println("�п��ܻ��н�");
			}else if(d.equals("����")){
				System.out.println("����ͼ����ɻ");
			}else{
				System.out.println("������󡣡���");
			}
					

		}else{
			System.out.println("������󣡣���");
		}
	}
	

}