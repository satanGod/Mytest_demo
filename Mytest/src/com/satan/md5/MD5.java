package com.satan.md5;

public class MD5 {
	public static void main(String[] args) {
		System.out.println(MD5.getMD5("123456"));
		System.out.println(MD5.encodeHex("1g2345h6".getBytes()));
		System.out.println(str.length());
	}
	public static String getMD5(String str){
		char[] c = encodeHex(str.getBytes());
		return c.toString();
	}
	public static char[] encodeHex(byte[] data) {

		int l = data.length;
		char[] out = new char[l << 1];
		// two characters form the hex value.
		for (int i = 0, j = 0; i < l; i++) {
			out[j++] = DIGITS[(0xF0 & data[i]) >>> 4];
			out[j++] = DIGITS[0x0F & data[i]];
		}
		return out;
	}
	private static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	
	private static final String str = "霸屏射线ۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖbiubiu 霸屏射线ۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖbiubiu 霸屏射线ۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖbiubiu 霸屏射线ۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖbiubiu 霸屏射线ۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖbiubiu 霸屏射线ۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖbiubiu 霸屏射线ۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖbiubiu 霸屏射线ۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖbiubiu 霸屏射线ۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖbiubiu 霸屏射线ۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۣۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖۖbiubi";
}
