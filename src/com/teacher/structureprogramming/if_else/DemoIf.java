package com.teacher.structureprogramming.if_else;

public class DemoIf {

	public static void main(String[] args) {

		int a = 10;
		// Cu phap 1: Simple if
		if (a % 2 == 0) {
			System.out.println("a la so chan");
		}
		// Cu phap 2 voi else
		a = 11;
		if (a % 2 == 0) {
			System.out.println("a la so chan");
		} else {
			System.out.println("a la so le");
		}

	}

}
