package com.teacher.structureprogramming.homeworks.gcd;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input integer number 1:");
		int x = sc.nextInt();

		System.out.println("Input integer number 2:");
		int y = sc.nextInt();
		sc.close();
		System.out.println("Greatest common divisor " + x + " and " + +y + " is : " + gcd(x, y));
	}

	public static int gcd(int a, int b) {
		int gcd = 1; // initial gcd equal 1;

		for (int k = 2; k <= a && k <= b; k++) {
			if ((a % k == 0) && (b % k == 0)) {
				gcd = k;
			}
		}
		return gcd;

	}

}
