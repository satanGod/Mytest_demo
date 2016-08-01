package com.satan.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RecursionList {
	
	static class A{
		
		private String name;
		
		private int sort;
		
		private List<A> children;

		public List<A> getChildren() {
			return children;
		}

		public void setChildren(List<A> children) {
			this.children = children;
		}

		public String getName() {
			return name;
		}

		public int getSort() {
			return sort;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setSort(int sort) {
			this.sort = sort;
		}

		@Override
		public String toString() {
			return "A [name=" + name + ", sort=" + sort +"]";
		}
		
		
	}
	
	public static void main(String[] args) {
		
		List<A> l = new ArrayList<A>();
		List<A> children = new ArrayList<A>();
		List<A> children2 = new ArrayList<A>();
		
		for(int i = 1;i<4;i++){
			A a = new A();
			a.setName(i+"a");
			a.setSort(i);
			int ran = 2;
			for(int j = 1;j<ran;j++){
				A b = new A();
				b.setName(i*10+j+"b");
				b.setSort(i*10+j);
				
				int rang = 4;
				for(int g=1;g<rang;g++){
					A c = new A();
					c.setName(i*100+j*10+g+"c");
					c.setSort(i*100+j*10+g);
					children2.add(c);
				}
				b.setChildren(children2);
				children.add(b);
			}
			a.setChildren(children);
			l.add(a);
			
		}
		
		new RecursionList().getList(l);
		
		
	}
	/**
	 * 迭代 递归遍历所有list
	 * @param l
	 * @author jiangxu
	 * 2016年6月7日
	 */
	public  void getList(List<A> l){
		Iterator<A> itor=l.iterator();
		while(itor.hasNext()){
			A e = itor.next();
			System.out.println(e.toString());
			if(null != e.getChildren()){
				getList(e.getChildren());
			}
		}
//		for(A a:l){
//			System.out.println(a.toString());
//			if(!a.getChildren().isEmpty()){
//				getList(a.getChildren());
//			}
//		}
		
	}
}
