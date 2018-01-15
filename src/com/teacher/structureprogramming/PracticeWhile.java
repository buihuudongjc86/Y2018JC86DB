package com.teacher.structureprogramming;

public class PracticeWhile {

	public static void main(String[] args) {
		// yeu cau: Tinh tong cac so tu 1...n voi n nhap tu ban phim
		// VD: n= 10; sum:=1+2+3+4+...+10?

		// (((((((0+1)+2)+3)+4)+5)+6)+7)
		// 1/n+1 + 1/n^2 +..+...

		int n = 20;
		int i = 0;
		int sum = 0;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("Tong la: " + sum);

	}

}
