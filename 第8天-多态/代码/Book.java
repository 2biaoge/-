/*
��
1 ��������ͬ
2 ����������ͬ�����
3 �����б���ͬ
4 Ȩ�޲��ܱȸ����ϸ�
*/
public class Book extends Object{
	//����
	String bookname;//����
	int pageCount;//ҳ��
	double price;//�۸�
	String author;//����
	
	
	//����
	public void print(){
		System.out.println("����:"+bookname+" ҳ��:"+pageCount+" �۸�"+price+" ���ߣ�"+author);
	}

	//��д equals
	
	public boolean equals(Object obj){
		Book b=(Book)obj;
		return bookname.equals(b.bookname);
	}
	// ��дtoString()
	public String toString(){
		return bookname+" "+author;
	}	
}