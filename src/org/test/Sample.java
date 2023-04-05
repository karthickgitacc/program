package org.test;

public class Sample {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int b=0;
	for (int i = 0; i < a.length; i++) {
		b=a[i]+b;
		System.out.println(b);
	}
	
	System.out.println("================");
	System.out.println(b);
	
	System.out.println(a.length);
}
}
