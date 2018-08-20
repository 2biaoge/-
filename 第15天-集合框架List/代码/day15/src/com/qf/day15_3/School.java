package com.qf.day15_3;

public class School<T> {
	private String name;
	private T t;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", t=" + t + "]";
	}
		
	
}
