package com.qf.day12_6;
/**
 * 服装厂
 * @author wgy
 *
 */
public class ClothesFactory {
	//1 裤子 2外套 3T恤
	public static Clothes make(String type){
		Clothes clothes=null;
		if(type.equals("1")){
			clothes=new Pants();
		}else if(type.equals("2")){
			clothes=new Coat();
		}else if(type.equals("3")){
			clothes=new T_shirt();
		}
		if(clothes!=null){
			clothes.design();
			clothes.produce();
		}
		return clothes;
	}
}
