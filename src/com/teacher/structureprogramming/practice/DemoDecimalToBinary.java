package com.teacher.structureprogramming.practice;

public class DemoDecimalToBinary {

	public static void main(String[] args) {
		long n = Long.MAX_VALUE;
		System.out.println(Dec2Binary(n));

	}

	public static String Dec2Binary(long n) {
		/*
		 * Desc: Convert Decimal number to Binary. Date: 16.01.2018
		 * 
		 */
		String strResult = "";
		long remainder;
		while (n != 0) {
			// remainder = (n - 2 * (n / 2));
			remainder = n % 2;
			n /= 2;
			strResult = remainder + strResult;
		}
		return strResult;

	}

}
