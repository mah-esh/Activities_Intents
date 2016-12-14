package com.mahesh;

public class Reverse {
	public static void main(String[] args) {
		String s = "mahesh";
		for(int i=s.length()-1; i>=0; i--)
			System.out.print(s.charAt(i));
	}
}
