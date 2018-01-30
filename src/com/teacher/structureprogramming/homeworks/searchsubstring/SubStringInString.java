package com.teacher.structureprogramming.homeworks.searchsubstring;

public class SubStringInString {

	public static void main(String[] args) {
		System.out.println(search("a aa a ada a a ada aad", "d"));
	}

	public static int search(String text, String subText) {

		// 1. Lay chieu dai cua chuoi can text
		int lengthOfText = text.length();
		int lengthOfSubText = subText.length();
		int count = 0;
		// 2. Repeat
		for (int i = 0; i <= (lengthOfText - lengthOfSubText); i++) {
			int j;
			for (j = 0; j < lengthOfSubText; j++) {
				if (text.charAt(i + j) != subText.charAt(j)) {
					break;
				}
			}
			if (j == subText.length())
				count++;
		}
		return count;
	}

}
