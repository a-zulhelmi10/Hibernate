package com.service;

public class PalindromeCheck3 {
	static String str = "java";
	static String reverse = "";
	public static boolean isPalindrome() {
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse+=str.charAt(i);
	}
	if (str.equals(reverse))
		return true;
	else
		return false;
}
	
	public static void main(String[] args) {
	boolean n = isPalindrome();
	System.out.println(reverse);
	System.out.println(n);
		
}
}