package com.satan.regex;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAndPattern {
	public static void main(String[] args) {
		String cardId = "511623198911105239";
		Date before = new Date();
		for(int i = 0;i<2000;i++){
			cardId.matches("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$");
		}
		Date after = new Date();
		System.out.println(after.getTime()-before.getTime());
		Date b2 = new Date();
		for(int i=0;i<2000;i++){
			Pattern pattern = Pattern.compile("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$");
			Matcher matcher = pattern.matcher(cardId);
			matcher.matches();
		}
		Date a2 = new Date();
		System.out.println(a2.getTime()-b2.getTime());
		
		StringAndPattern.reg(cardId);
	}
	
	public static void reg(String cardId){
		String sex = cardId.substring(cardId.length()-2, cardId.length()-1);
		int mark = Integer.parseInt(sex);
		sex = mark%2==1?"男":"女";
		System.out.println(sex);
	}
}
