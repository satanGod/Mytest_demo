package com.satan.list;

import java.util.ArrayList;
import java.util.List;

public class IsListAutomaticMounting {

 public static void main(String[] args) {
	IsListAutomaticMounting eg = new IsListAutomaticMounting();
	eg.show();
	eg.new A();
}
 
	public void show(){
		A a1 = new A();
		a1.setName("a1");
		A a2 = new A();
		a2.setName("a2");
		List<A> list = new ArrayList<A>();
		list.add(a1);
		list.add(a2);
		int count = 1;
		for(A each:list){
			each.setAge(count);
			count++;
		}
		for(A each:list){
			System.out.println("name:"+each.getName()+"->"+each.getAge());
		}
	}
	private class A{
		private String name;
		
		private int age;

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
	}
}
