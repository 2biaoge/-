package com.qf.day23_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.xml.sax.XMLReader;

/*
 * 解析books.xml文件
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		//readxml();
		//writeXml();
		//updateXml();
		updateXml2();
	}
	//1读取xml文件
	public static void readxml() throws Exception{
		//1创建SaxReader
		SAXReader reader=new SAXReader();
		//2获取Document对象
		Document document=reader.read(new FileReader("src\\books2.xml"));
		//3获取根节点
		Element root=document.getRootElement();//books
		//System.out.println(root.getName());
		//4获取book集合
		List<Element> bookList=root.elements("book");
		for (Element b : bookList) {
			//System.out.println(b.getName());
			//5获取属性
			String id=b.attributeValue("id");
			String name=b.element("name").getText();
			String author=b.element("author").getText();
			String price=b.elementText("price");
			Book book=new Book(Integer.parseInt(id), name, author, Double.parseDouble(price));
			System.out.println(book.toString());
		}
		
	}
	//2写入xml文件
	
	public static void writeXml() throws Exception{
		//1 创建SaxReader
		SAXReader reader=new SAXReader();
		//2读取
		Document document=reader.read(new FileReader("src\\books2.xml"));
		//3获取根节点
		Element root = document.getRootElement();
		//4添加节点
		Element newbook = root.addElement("book");
		//5添加属性
		newbook.addAttribute("id","1003");
		//6newbook添加name author price
		newbook.addElement("name").setText("android开发");;
		newbook.addElement("author").setText("老张");;
		newbook.addElement("price").setText("88.8");;
		
		//7写入文件中
		OutputFormat format=OutputFormat.createPrettyPrint();//创建一个漂亮的输出格式
		format.setEncoding("utf-8");
		XMLWriter writer=new XMLWriter(new FileWriter("src\\books2.xml"), format);
		writer.write(document);
		writer.close();
		System.out.println("写入成功");
		
	}
	
	//3 修改和删除xml文件内容
	
	public static void updateXml() throws Exception{
		//1创建Xmlreader
		SAXReader reader=new SAXReader();
		//2文档
		Document document = reader.read(new FileReader("src\\books2.xml"));
		//3获取根节点
		Element root = document.getRootElement();
		
		
		//4获取id=1003的book
		List<Element> elements = root.elements("book");
		Element bookEle = elements.get(2);
		bookEle.element("name").setText("android从入门到大神");
		Element first =elements.get(0);
		//5删除
		root.remove(first);
		
		//6写入
		OutputFormat format=OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter writer=new XMLWriter(new FileWriter("src\\books2.xml"), format);
		writer.write(document);
		writer.close();
		
		System.out.println("修改删除完毕");
	}
	//注释
	public static void updateXml2() throws Exception{
		//1创建Xmlreader
		SAXReader reader=new SAXReader();
		//2文档
		Document document = reader.read(new FileReader("src\\books2.xml"));
		//3获取根节点
		Element root = document.getRootElement();
		
		Iterator iterator = root.nodeIterator();
		int count=0;
		while(iterator.hasNext()){
			Object obj=iterator.next();
			if(obj instanceof Comment){
				count++;
				if(count==1){
					Comment comment=(Comment) obj;
					root.remove(comment);
					break;
				}
				
			}
		}
		
	
		//6写入
		OutputFormat format=OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter writer=new XMLWriter(new FileWriter("src\\books2.xml"), format);
		writer.write(document);
		writer.close();
		
		System.out.println("修改删除完毕");
	}
}
