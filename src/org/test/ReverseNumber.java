package org.test;

public class ReverseNumber {
	public static void main(String[] args) {
		int a = 123789;
		int b = 0;
		for (int i = a; i > 0; i--) {
			b = i;
			System.out.println(b);
		}
	}
}
