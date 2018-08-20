package com.qf.day19;

public class Test {
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo("子线程1");
		ThreadDemo t2=new ThreadDemo("子线程2");
//		t1.setName("子线程1");
//		t2.setName("子线程2");
		t1.start();
		t2.start();
	}
}
