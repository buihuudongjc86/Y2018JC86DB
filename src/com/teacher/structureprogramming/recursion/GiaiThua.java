package com.teacher.structureprogramming.recursion;

public class GiaiThua {

	public static void main(String[] args) {
		System.out.println(Factorial(6));
	}

	// 1. Định nghĩa 1 phương thức để tính n!
	public static int Factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * (Factorial(n - 1));
		}

	}

}
