public class Test{
	public static void main(String[] args){
		//1����Բ
		Circle myCircle=new Circle();
		myCircle.radius=5;//���ð뾶
		//2������
		Point myPoint=new Point();
		myPoint.x=10;
		myPoint.y=5;
		
		//3���÷���
		myCircle.calcGirth();
		myCircle.calcArea();
		myCircle.pointCircleRel(myPoint);
	}
}