/*
转义字符
\n 换行
\r 回车
\t 水平制表符  table
\' 单引号
\" 双引号

*/
public class Demo8{
	public static void main(String[] args){
		System.out.print("大家好,我是老王...\n");
		System.out.print("哈哈哈哈哈\r");
		System.out.print("嘿嘿嘿\n");
		System.out.println("姓名\t年龄\t性别");
		System.out.println("张三\t20\t男");

		System.out.println("输出一个双引号\"");
		System.out.println('\'');
		System.out.println("输出一个双引号'");
	}
}