package com.teacher.structureprogramming.switch_case;

import java.util.Scanner;

public class DemoSwitchCase {

	public static void main(String[] args) {
		System.out.print("Hay nhap thang:");
		int month = new Scanner(System.in).nextInt();

		switch (month) {
		case 1:
			System.out.println("Thang 1");
			// break;
		case 2:
			System.out.println("Thang 2");
			// break;
		case 3:
			System.out.println("Thang 3");
			// break;
		case 4:
			System.out.println("Thang 4");
			break;
		case 5:
			System.out.println("Thang 5");
			break;
		case 6:
			System.out.println("Thang 6");
			break;
		case 7:
			System.out.println("Thang 7");
			break;
		case 8:
			System.out.println("Thang 8");
			break;
		case 9:
			System.out.println("Thang 9");
			break;
		case 10:
			System.out.println("Thang 10");
			break;
		case 11:
		case 12:
			System.out.println("Thang double");
			break;
		default:
			System.out.println("Over");
			break;

		}
	}

}
