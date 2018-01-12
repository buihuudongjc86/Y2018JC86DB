package com.teacher.datatype;

public class Sample02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;

		String sFullName = "Nguyễn Văn A";

		if ((a > b) && (a != b)) {
			System.out.println("Giá trị của " + a + " lớn hơn " + b);
		}

		if (true) {
			System.out.println("Ok!");
		}
		// System.out.println("giá trị của a: " + (++a));

		/*
		 * System.out.println("giá trị của a: " + (a++)); Desc: Hàm này thực hiện tính
		 * lương cho cán bộ nhân viên Date: 10/01/2018 Author: Nguyễn Văn A ------
		 */

		a++;
		System.out.println("giá trị của a: " + (a));

		System.out.println(sFullName.concat(" Cưới Nguyễn Thị B"));

	}

}
