package com.teacher.structureprogramming.forloop;

public class DemoForLoop {

	public static void main(String[] args) {
		// in ra màn hình số từ 1...n

		int n = 20;
		// Cú pháp for
		for (int i = 0; i <= n; i++) {
			System.out.println("Giá trị thứ " + (i + 1) + " là: " + i);
		}
		// For lồng nhau
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + "   " + j);
			}
		}
		// Thay thế vòng for thứ 2 bằng while
		int i = 0, j = 0;
		for (i = 0; i < 20; i++) {
			while (j < 10) {
				System.out.println(i + "   " + j);
				j++;
			}
		}

	}

}
