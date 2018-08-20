package com.qf.day20_7;

public class Test {
	public static void main(String[] args) {
		//1创建容器
		BreadCon con=new BreadCon();
		//2生产
		Product product=new Product(con);
		//3消费
		Consume consume=new Consume(con);
		//4线程对象
		Thread shaqiang=new Thread(product, "莎强");
		Thread xiaocang=new Thread(consume,"小苍");
		//5启动
		shaqiang.start();
		xiaocang.start();
	}
}
