/*
Բ
*/
public class Circle{
	//����
	//�뾶
	double radius;
	//Բ�� 
	int x=0;
	int y=0;		
	//����
	//�����ܳ�
	public void calcGirth(){
		double girth=2*3.14*radius;
		System.out.println("�뾶Ϊ"+radius+"���ܳ���:"+girth);
	}
	//�������
	public void calcArea(){
		double area=3.14*radius*radius;
		System.out.println("�뾶Ϊ"+radius+"�������:"+area);
	}
	//������Բʲô��ϵ
	public void pointCircleRel(Point p){
		double n=Math.sqrt(p.x*p.x+p.y*p.y);	
		if(n>radius){
			System.out.print("����Բ��");
		}else if(n<radius){
			System.out.println("����Բ��");
		}else{
			System.out.println("����Բ��");
		}
	}
	
}