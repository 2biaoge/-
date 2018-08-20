package com.qf.day18_4;

import java.io.BufferedReader;
import java.io.PrintStream;

public class Test {
	public static void main(String[] args) {
		ReadFile readFile=new ReadVideoFile();
		BuffedReadFile brf=new BuffedReadFile(readFile);
		brf.read();
		
		
	}
}
