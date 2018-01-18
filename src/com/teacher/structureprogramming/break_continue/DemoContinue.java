package com.teacher.structureprogramming.break_continue;

public class DemoContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			if (i >= 8 && i <= 12) {
				continue;
			}
			System.out.println("Giá trị của i là: " + i);
		}

	}

}
