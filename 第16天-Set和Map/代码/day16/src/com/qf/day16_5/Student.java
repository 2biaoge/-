package com.qf.day16_5;

import java.util.TreeMap;
import java.util.TreeSet;

public class Student {
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
	
	@Override
	public int hashCode() {
		int num1=name.hashCode();
		int num2=address.hashCode();
		return num1+num2;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj ==null){
			return false;
		}
		if(obj instanceof Student){
			Student s=(Student)obj;
			if(this.name.equals(s.getName())&&this.address.equals(s.getAddress())){
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
