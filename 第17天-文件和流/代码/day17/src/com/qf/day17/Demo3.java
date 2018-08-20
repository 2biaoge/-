package com.qf.day17;

import java.io.File;

public class Demo3 {
	public static void main(String[] args) {
		//1创建File对象
		File  file=new File("d:\\abc.txt");
		//2重命名(具有剪切的功能)
		file.renameTo(new File("d:\\pic\\123.txt"));
	}
}
