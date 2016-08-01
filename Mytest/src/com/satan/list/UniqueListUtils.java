package com.satan.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UniqueListUtils<T> {
	/**
	 * 拙劣的去重处理
	 * @param list
	 * @return
	 * @author jiangxu
	 * 2016年5月9日
	 */
	public static <T> List<T> removeDuplicateWithList(List<T> list) {  
        Set<T> set = new HashSet<T>();  
        List<T> newList = new ArrayList<T>();  
        for (Iterator<T> iter = list.iterator(); iter.hasNext();) {  
            T element = iter.next();  
            if (set.add(element))  
                newList.add(element);  
        }   
        return newList;  
    }
	
	/**
	 * java自带去重处理
	 * @param list
	 * @return
	 * @author jiangxu
	 * 2016年5月9日
	 */
	public static <T> List<T> removeDuplicateByHashSet(List<T> list){
		List<T> newlist = new ArrayList<T>(new HashSet<T>(list));
		return newlist;
	}
	
	public static void main(String[] args) {
		new UniqueListUtils<>().judgeList();
	}
	
	public void judgeList(){
		Set<A> list = new HashSet<A>();
		for(int i=1;i<4;i++){
			A a = new A(1,1);
			list.add(a);
		}
		for(int i=2;i<6;i++){
			A a= new A(1,1);
			if(list.add(a)){
				System.out.println("添加成功->"+i);
			}
		}
		for(A a:list){
			System.out.println(a.toString());
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
