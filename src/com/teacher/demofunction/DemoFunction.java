package com.teacher.demofunction;

import java.util.Scanner;

public class DemoFunction { // namespace

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // heap, stack.

		System.out.println("Ban hay nhap gia tri x: ");
		int x = sc.nextInt(); // integer
		System.out.println("Ban hay nhap gia tri y: ");
		int y = sc.nextInt();

		System.out.println("The total is: " + tinhTong(x, y));

		sc.close();

		displayInfor();

	}

	public static int tinhTong(int a, int b) {
		return a + b;
	}

	public static void displayInfor() {
		System.out.println("my name is Dong");
		System.out.println("my first name is Bui");

	}

}
