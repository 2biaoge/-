package com.qf.task2;
/*
 * 电话本
 * 三个功能
 * 新增
 * 查找
 * 查找所有
 */
public class PhoneBook {
	
	private Linkman[] linkmans=new Linkman[10];
	
	private int count=0;
	
	
	public Linkman[] getLinkmans() {
		return linkmans;
	}

	//新增联系人
	public void add(Linkman l){
		if(count>9){
			System.out.println("电话本已满，不能再添加了...");
		}else{
			linkmans[count]=l;
			count++;
		}
	}
	//搜索
	public Linkman[] search(String name){
		Linkman[] linkmans2=new Linkman[10];
		int index=0;
		for(int i=0;i<10;i++){
			
			Linkman l=linkmans[i];
			if(l!=null){
				String s=l.getName();
				if(s.equals(name)){
					linkmans2[index]=l;
					index++;
				}
			}
		}
		return linkmans2;
	}
	//打印所有的联系人
	public void searchAll(){
		for(Linkman l:linkmans){
			if(l!=null){
				System.out.println(l.toString());
			}
		}
	}
}
