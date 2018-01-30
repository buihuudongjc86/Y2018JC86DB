package com.teacher.demofunction;

public class TestSpeed {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (long i = 0; i < 1000000000; i++) {
			if (i < 0) {
				System.out.println("Am roi");
			}
		}
		long end = System.currentTimeMillis();
		long t = end - start;
		System.out.println("Tong thoi gian " + t);

	}

}
