package com.teacher.structureprogramming.homeworks.greatestcommondivisorusingrecursion;

import java.util.Scanner;

public class GCDRecursion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter two integers: ");
		int m = Integer.parseInt(input.next());
		int n = Integer.parseInt(input.next());

		System.out.println("The greatest common divisor of " + m + " and " + n + " is " + gcd(m, n));
	}

	private static int gcd(int m, int n) {
		if (m % n == 0)
			return n; // Base case
		else // Recursive call
			return gcd(n, m % n);
	}

}
