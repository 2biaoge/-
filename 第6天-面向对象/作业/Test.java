public class Test{
	public static void main(String[] args){
		//1创建圆
		Circle myCircle=new Circle();
		myCircle.radius=5;//设置半径
		//2创建点
		Point myPoint=new Point();
		myPoint.x=10;
		myPoint.y=5;
		
		//3调用方法
		myCircle.calcGirth();
		myCircle.calcArea();
		myCircle.pointCircleRel(myPoint);
	}
}