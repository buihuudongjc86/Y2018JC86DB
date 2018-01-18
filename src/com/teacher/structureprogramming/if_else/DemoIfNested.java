package com.teacher.structureprogramming.if_else;

public class DemoIfNested {

	public static void main(String[] args) {
		int a = 11;
		int b = 21;

		if (a % 2 == 0) {
			if (!(b % 2 == 0)) {
				System.out.println("Working !");
			}
		} else {
			System.out.println("a la so le");
		}
	}

}
