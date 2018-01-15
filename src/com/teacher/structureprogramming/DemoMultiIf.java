package com.teacher.structureprogramming;

import java.util.Scanner;

public class DemoMultiIf {

	public static void main(String[] args) {

		System.out.print("Hay nhap diem:");
		double dMark = new Scanner(System.in).nextDouble();

		// long balance = 123_456_789;
		if (dMark <= 0 || dMark > 10) {
			System.out.println("Gia tri diem khong hop le");
			return;
		}

		if (dMark <= 4) {
			System.out.println("Hoc luc yeu !");
		} else if (dMark >= 5.0 && dMark <= 6.0) {
			System.out.println("Hoc luc trung binh");
		} else if (dMark > 6.0 && dMark <= 7.0) {
			System.out.println("Hoc luc kha");
		} else if (dMark > 7.0 && dMark <= 9.0) {
			System.out.println("Hoc luc gioi");
		} else {
			System.out.println("Hoc luc xuat sac !");
		}
	}

}
