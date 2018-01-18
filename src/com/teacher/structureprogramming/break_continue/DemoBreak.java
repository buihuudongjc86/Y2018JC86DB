package com.teacher.structureprogramming.break_continue;

public class DemoBreak {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			System.out.println("Giá trị của i là: " + i);
			if (i == 9) {
				break;
			}

		}

		System.out.println("Ra khỏi vòng lặp");

	}

}
