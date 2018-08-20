/*
书
1 方法名相同
2 返回类型相同或兼容
3 参数列表相同
4 权限不能比父类严格
*/
public class Book extends Object{
	//属性
	String bookname;//书名
	int pageCount;//页数
	double price;//价格
	String author;//作者
	
	
	//方法
	public void print(){
		System.out.println("书名:"+bookname+" 页数:"+pageCount+" 价格："+price+" 作者："+author);
	}

	//重写 equals
	
	public boolean equals(Object obj){
		Book b=(Book)obj;
		return bookname.equals(b.bookname);
	}
	// 重写toString()
	public String toString(){
		return bookname+" "+author;
	}	
}