package org.test;

public class AmstrongNumber {
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int arm=0;
		while(num>0) {
			int n=num%10;
			arm=arm+(n*n*n);
			num/=10;
			
		}
		if (arm==temp) {
			System.out.println("arm");
		}
		else {
			System.out.println("not");
		}
	}

}
