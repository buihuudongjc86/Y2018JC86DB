package com.teacher.structureprogramming.while_dowhile;

public class DemoDoWhile {

	public static void main(String[] args) {

		int n = 0;
		long sum = 0;
		int i = 1;

		do {
			sum += i;
			i++;
		} while (i <= n);
		System.out.println("Tong la: " + sum);

		/*
		 * String strBinary ="";
		 * 
		 * while(thương còn <> 0) { 1. Lấy thương đó /2 2. dư 3. strBinary = dư +
		 * strBinary; //reversal }
		 */
	}

}
