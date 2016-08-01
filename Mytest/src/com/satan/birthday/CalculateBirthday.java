package com.satan.birthday;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateBirthday {
	public static void main(String[] args) {
		CalculateBirthday cal = new CalculateBirthday();
		int age = 0 ;
		int age2 = 0 ;
		try {
			age = cal.getAgeByCardId("511623199001105239");
			age2 = cal.getAgeByPosition("511623199001105239");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("age->"+age);
		System.out.println("age2->"+age2);
	}
	public  int getAgeByBirthday(Date birthday) {
		Calendar cal = Calendar.getInstance();

		if (cal.before(birthday)) {
			throw new IllegalArgumentException(
					"The birthDay is before Now.It's unbelievable!");
		}

		int yearNow = cal.get(Calendar.YEAR);
		int monthNow = cal.get(Calendar.MONTH) + 1;
		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);

		cal.setTime(birthday);
		int yearBirth = cal.get(Calendar.YEAR);
		int monthBirth = cal.get(Calendar.MONTH) + 1;
		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

		int age = yearNow - yearBirth;

		if (monthNow <= monthBirth) {
			if (monthNow == monthBirth) {
				// monthNow==monthBirth 
				if (dayOfMonthNow < dayOfMonthBirth) {
					age--;
				}
			} else {
				// monthNow>monthBirth 
				age--;
			}
		}
		return age;
	}
	
	public  int getAgeByCardId(String cardId) throws Exception{
		int age = 0;
		boolean flag = this.judgeCardIdRules(cardId);
		if(!flag){
			throw new Exception("身份证号格式错误!");
		}
		String dates = cardId.substring(6, 10) + "-" + cardId.substring(10, 12) + "-" + cardId.substring(12, 14);
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		ParsePosition position = new ParsePosition(6);
		simple.parse(cardId, position);
		age = this.getAgeByBirthday(simple.parse(dates));
		return age;
	}
	
	public int getAgeByPosition(String cardId) throws Exception{
		int age = 0;
		boolean flag = this.judgeCardIdRules(cardId);
		if(!flag){
			throw new Exception("身份证号格式错误!");
		}
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		ParsePosition position = new ParsePosition(6);//有误！！
		age = this.getAgeByBirthday(simple.parse(cardId, position));
		return age;
	}
	
	private static final String reg = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";
	
	public  boolean judgeCardIdRules(String cardId){
		Pattern pattern = Pattern.compile(reg);
		Matcher match = pattern.matcher(cardId);
		return match.matches();
	}
}
