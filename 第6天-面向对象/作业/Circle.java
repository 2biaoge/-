/*
圆
*/
public class Circle{
	//属性
	//半径
	double radius;
	//圆心 
	int x=0;
	int y=0;		
	//方法
	//计算周长
	public void calcGirth(){
		double girth=2*3.14*radius;
		System.out.println("半径为"+radius+"的周长是:"+girth);
	}
	//计算面积
	public void calcArea(){
		double area=3.14*radius*radius;
		System.out.println("半径为"+radius+"的面积是:"+area);
	}
	//计算点和圆什么关系
	public void pointCircleRel(Point p){
		double n=Math.sqrt(p.x*p.x+p.y*p.y);	
		if(n>radius){
			System.out.print("点在圆外");
		}else if(n<radius){
			System.out.println("点在圆内");
		}else{
			System.out.println("点在圆上");
		}
	}
	
}