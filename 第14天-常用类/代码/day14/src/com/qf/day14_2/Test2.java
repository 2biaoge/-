package com.qf.day14_2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test2 {
	public static void main(String[] args) throws Exception{
		BigDecimal b1=new BigDecimal("1.4");  //1.4+(-0.5);
		BigDecimal b2=new BigDecimal("-0.5");
		BigDecimal b3=new BigDecimal("0.9");
		BigDecimal result=b1.add(b2).divide(b3);
		System.out.println(result);
		//
		BigInteger bigInteger= new BigInteger("1231241312312312412312312123123413123");
		BigInteger bigInteger2=new BigInteger("1123124131231231241231231212312314123");
		BigInteger result2=bigInteger.add(bigInteger2);
		System.out.println(result2);
	}
}
