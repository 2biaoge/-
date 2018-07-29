/*
char类型 
2个字节 
0-65535   65536个字符
*/
public class Demo7{
	public static void main(String[] args){
		char c='a';//字符用单引号
		char c1='大';
		char c2=97;
		char c3=20013;
		char c4='\u0061';
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}