package com.satan.list;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class HashSetMisunderstanding {
	public static void main(String[] args) {
		new HashSetMisunderstanding().judgeList();
	}
	public void judgeList(){
		Set<A> list = new HashSet<A>();//这里创建一个hashset集合
		A a = new A(1,1);//循环中创建新的对象A来存储相同的数据
		for(int i=1;i<4;i++){
			list.add(a);
		}
		for(int i=2;i<6;i++){
			if(list.add(a)){//判断是否能存储进去
				System.out.println("添加成功->"+i);
			}
		}
		for(A aa:list){
			System.out.println(aa.toString());//打印出相应的值 看看是否唯一
		}
	}
	
	class A implements Serializable{
		private static final long serialVersionUID = 1L;
		private Integer mi;
		private Integer bi;
		
		public A() {
			super();
		}
		public A(Integer mi, Integer bi) {
			super();
			this.mi = mi;
			this.bi = bi;
		}
		public Integer getMi() {
			return mi;
		}
		public Integer getBi() {
			return bi;
		}
		public void setMi(Integer mi) {
			this.mi = mi;
		}
		public void setBi(Integer bi) {
			this.bi = bi;
		}
		@Override
		public String toString() {
			
			return (mi==null?mi:mi.toString())+"--"+(bi==null?bi:bi.toString());
		}
	}
}
