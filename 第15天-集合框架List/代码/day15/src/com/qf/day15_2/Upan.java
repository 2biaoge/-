package com.qf.day15_2;

public class Upan<T> implements USB<T>{

	@Override
	public void service(T t) {
		System.out.println(t);
	}

}
