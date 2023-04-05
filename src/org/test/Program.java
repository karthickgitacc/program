package org.test;

public class Program {
	public static void main(String[] args) {
//		String[] a = "Welcome to java name".split(" ");
//		String b="";
//		char[] c;
//		for (int i = 0; i < a.length-1; i++) {
//			if (i % 2 ==0) {
//				System.out.print(a[i] + " ");
//			} else {
//				for (int j = a.length - 1; j >= 0; j--) {
//					c= a[j].toCharArray();
//					System.out.print("" + c[j]+" ");
//
//				}
//
//			}
//
//		}
		
		
		int num = 123218;
		int count= 0;
		while(num>0) {
			count++;
			num/=10;
			
		}
System.out.println(count);
	}

}
