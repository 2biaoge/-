package com.qf.day12_4;


public class Test {
	public static void main(String[] args) {
		Cryable cryable=new Dog();
		cryable.cry();
		
		//使用匿名内部类优化//内部添加了一个内部类，并实现Cryable接口
		/*Cryable cryable2=new Cryable() {
			
			@Override
			public void cry() {
				System.out.println("喵喵的叫...");
				
			}
		};
		
		cryable2.cry();
		*/
		 
		Cryable cryable2=new Cryable(){
			String name="xxx";
			@Override
			public void cry() {
				System.out.println("喵喵的叫..."+name);
				show();
			}
			
			public void show(){
				System.out.println(name);
			}
		};
		cryable2.cry();
	
		
		TracficTool car=new TracficTool() {
			
			@Override
			public void run() {
				System.out.println("汽车飞速的前进....");
				
			}
		};
		
		car.run();
	}
}
