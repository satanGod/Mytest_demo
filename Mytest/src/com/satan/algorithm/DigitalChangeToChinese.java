package com.satan.algorithm;

public class DigitalChangeToChinese {
	
	private static final String[] charNumber= {"零","一","二","三","四","五","六","七","八","九"};
	
	private static final String[] charChinese = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	
	private static final String[] power = {"","万","亿","万亿","亿亿"};
	
	private static final String[] chnUnitChar = {"","十","百","千"};
	
	private static final String[] chnUnitChinese = {"","拾","佰","仟"};
	
	
	public static String numberToChinese(int num){
		StringBuffer sb = new StringBuffer();
		int unitPos = 0;
		boolean needZero = false;
		while(num>0){
			int section = num%10000;
			
		}
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
}
