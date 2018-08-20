package com.qf.mianshi;

public class Test {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		System.out.println(a1.show(b)); // A and A
		System.out.println(a1.show(c)); // A and A
		System.out.println(a1.show(d)); // A and D
		System.out.println(a2.show(b)); // B and B
		System.out.println(a2.show(c)); // B and A
		System.out.println(a2.show(d)); // A and D
		System.out.println(b.show(b)); // B and B
		System.out.println(b.show(c)); // B and B
		System.out.println(b.show(d)); // B and B
										
	}
}
