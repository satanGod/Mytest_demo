package com.satan.test;

public class MathTest {
	private final static String[] avatar = 
		{"father.png","mother.png","fatherInlaw.png","motherInlaw.png",
		 "spouse1.png","spouse1_me.png","spouse2.png","spouse2_me.png",
		 "son1.png","son2.png","son3.png","son4.png",
		 "daughter1.png","daughter2.png","daughter3.png","daughter4.png"};
	private final static String url = "www.appvworks.com/ihealth/images/avatar/";
	public static void main(String[] args) {
//		double hours = 60*128/1028;
//		System.out.println(hours);
		
		boolean f = false;
		boolean g = false;
		boolean c = f^g;
		System.out.println(c);
		for(int i=0;i<avatar.length;i++){
			System.out.println("index->"+i+"------"+avatar[i]+"****   "+url+avatar[i]);
		}
		System.out.println(139.95+177+129+89+89+49+24.75+25.8+59.8+59.5+103.5+49+19.8);
		System.out.println("38prHNFfiMzrDt1ptrNDqNdfzTFk8j00Lr5I8ZAqXznt7olzo2LeaPdeuKF7Squx".length());
		
		
	}
}
