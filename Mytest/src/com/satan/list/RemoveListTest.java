package com.satan.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveListTest {
	
	public static void main(String[] args) {
		
		List<O1> list1 = new ArrayList<O1>();
		
		List<O2> list2 = new ArrayList<O2>();
		
		for(int i = 1;i<10;i++){
			O1 each = new O1();
			each.setAge(i);
			list1.add(each);
		}
		for(int i = 1;i<10;i++){
			O2 e = new O2();
			e.setAge(i);
			list2.add(e);
		}
		
		for(O1 each : list1){
			for(O2 l2:list2){
				if(each.getAge()==l2.getAge()){
					list2.remove(l2);
				}
			}
		}
		
		for(O2 l2:list2){
			System.out.println(l2.getAge()+"->"+l2.hashCode());
		}
		
	}
	
	static class O1{
		private int age;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}
	static class O2{
		private int age;
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
	}

}
